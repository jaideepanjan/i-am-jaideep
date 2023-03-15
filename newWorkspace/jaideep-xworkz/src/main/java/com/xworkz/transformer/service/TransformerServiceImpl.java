package com.xworkz.transformer.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.entity.TransformerEntity;
import com.xworkz.transformer.repositary.TransformerRepositry;

@Service
public class TransformerServiceImpl implements TransformerService {

	@Autowired
	private TransformerRepositry repositry;

	public TransformerServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public TransformerDTO findById(int id) {
		if (id > 0) {
			TransformerEntity entity = this.repositry.findById(id);

			if (entity != null) {
				System.out.println("entity is found in theservice for id" + id);
				TransformerDTO dto = new TransformerDTO();
				dto.setBrand(entity.getBrand());
				dto.setType(entity.getType());
				dto.setPhases(entity.getPhase());
				dto.setQualityStandards(entity.getQualityStandards());
				dto.setCoilType(entity.getCoilType());
				dto.setKva(entity.getKva());
				dto.setWeight(entity.getWeight());
				dto.setTypeOfCooling(entity.getTypeOfCooling());
				dto.setCost(entity.getCost());
				dto.setId(entity.getId());

				return dto;
			}
		}
		return TransformerService.super.findById(id);
	}

	@Override
	public Set<ConstraintViolation<TransformerDTO>> ValidateAndSave(TransformerDTO dto) {
		System.out.println("Running ValidateAndSave in Service ");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TransformerDTO>> constraintViolations = validator.validate(dto);

		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.out.println("constraintViolations in dto " + dto);
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist data is good " + dto);

			TransformerEntity entity = new TransformerEntity();

			entity.setPhase(dto.getPhases());
			entity.setQualityStandards(dto.getQualityStandards());
			entity.setCoilType(dto.getCoilType());
			entity.setKva(dto.getKva());
			entity.setWeight(dto.getWeight());
			entity.setTypeOfCooling(dto.getTypeOfCooling());
			entity.setType(dto.getType());
			entity.setCost(dto.getCost());
			entity.setBrand(dto.getBrand());

			this.repositry.save(entity);

			return Collections.emptySet();
		}

	}

	@Override
	public Set<ConstraintViolation<TransformerDTO>> ValidateAndUpdate(TransformerDTO dto) {
		System.out.println("Running ValidateAndUpdate in service......");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TransformerDTO>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.out.println("Violations are error");
			return violations;
		} else {
			System.out.println("Violations is not there in dto, can save the data");

			TransformerEntity entity = new TransformerEntity();

			entity.setId(dto.getId());
			entity.setBrand(dto.getBrand());
			entity.setType(dto.getType());
			entity.setPhase(dto.getPhases());
			entity.setQualityStandards(dto.getQualityStandards());
			entity.setCoilType(dto.getCoilType());
			entity.setKva(dto.getKva());
			entity.setWeight(dto.getWeight());
			entity.setTypeOfCooling(dto.getTypeOfCooling());			
			entity.setCost(dto.getCost());
			
			boolean saved=this.repositry.update(entity);
			System.out.println(saved);
			System.out.println(entity);
			
			return Collections.emptySet();

		}

		
	}

	@Override
	public List<TransformerDTO> findByBrand(String brand) {

		System.out.println("Running findByBrand in service " + brand);

		if (brand != null && !brand.isEmpty()) {
			System.out.println("ChatName is valid... calling repo...");

			List<TransformerEntity> entities = this.repositry.findByBrand(brand);

			List<TransformerDTO> listDTO = new ArrayList<TransformerDTO>();

			for (TransformerEntity entity : entities) {
				TransformerDTO dto1 = new TransformerDTO();
				dto1.setId(entity.getId());
				dto1.setBrand(entity.getBrand());
				dto1.setType(entity.getType());

				dto1.setPhases(entity.getPhase());
				dto1.setQualityStandards(entity.getQualityStandards());
				dto1.setCoilType(entity.getCoilType());
				dto1.setKva(entity.getKva());
				dto1.setWeight(entity.getWeight());
				dto1.setTypeOfCooling(entity.getTypeOfCooling());
				dto1.setCost(entity.getCost());

				listDTO.add(dto1);
			}

			System.out.println("Size of dtos " + listDTO.size());
			System.out.println("Size of entities " + entities.size());
			return listDTO;

		} else {
			System.out.println("Transformer Brand is invalid");
		}
		return TransformerService.super.findByBrand(brand);
	}

	@Override
	public boolean deleteById(int id) {
		System.out.println("Running deleteById in service");
		if(id>0) {
			this.repositry.deleteById(id);
			
		}
		return true;
	}
	
	


	@Override
	public List<TransformerDTO> displayAll() {
		System.out.println("running displayAll in service");
		List<TransformerEntity> list=this.repositry.displayAll();
		List<TransformerDTO> dto=new ArrayList<>();
		if(list!=null&&!list.isEmpty()) {
			for(TransformerEntity entity: list) {
				TransformerDTO dto1=new TransformerDTO();
				BeanUtils.copyProperties(entity, dto1);
				dto.add(dto1);
			}
			return dto;
		}else {
			System.out.println("no data founf in db");
			return Collections.emptyList();
		}
		
	}
	
	@Override
	public List<TransformerDTO> searchByTwo(String qualityStandards, String typeOfCooling) {
		System.out.println("running searchByTwo in service");
		List<TransformerEntity> list=this.repositry.searchByTwo(qualityStandards, typeOfCooling);
		List<TransformerDTO> dto=new ArrayList<>();
		if(qualityStandards!=null&&!qualityStandards.isEmpty() || typeOfCooling!= null && !typeOfCooling.isEmpty()) {
			for(TransformerEntity entity: list) {
				TransformerDTO dto1=new TransformerDTO();
				BeanUtils.copyProperties(entity, dto1);
				dto.add(dto1);
			}
			return dto;
		}else {
			System.out.println("no data founf in db");
			return Collections.emptyList();
		}
	}
	
	
	
	
	

}
