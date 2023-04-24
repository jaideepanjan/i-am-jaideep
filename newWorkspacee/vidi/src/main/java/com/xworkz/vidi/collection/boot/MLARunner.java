package com.xworkz.vidi.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.vidi.collection.dto.MLADTO;

public class MLARunner {

	public static void main(String[] args) {


		Collection<MLADTO> mlaDTOs=new ArrayList<>();
		
		mlaDTOs.add(new MLADTO("Shashikala Annasaheb Jolle", 53, "Nippani", "BJP", false, "Female"));
		mlaDTOs.add(new MLADTO("Ganesh Hukkeri", 44, "Chikkodi-Sadalga", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Mahesh Kumathalli", 60, "Athani", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Srimant Patil", 44, "Kagwad", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("P. Rajeev", 44, "Kudachi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("D. M. Basavantaray", 40, "Kittur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Duryodhan Mahalingappa Aihole", 46, "Raibag", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Umesh Katti", 65, "Hukkeri", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Balachandra Jarkiholi", 59, "Arabhavi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Ramesh Jarkiholi", 48, "Gokak", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Satish Jarkiholi", 50, "Yemkanmardi", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Anil S Benake", 50, "Belagavi Uttar", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Abhay Patil", 46, "Belagavi Dakshin", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Lakshmi Hebbalkar", 59, "Belagavi Rural", "Congress", false, "Female"));
		mlaDTOs.add(new MLADTO("Anjali Nimbalkar", 47, "Khanapur", "BJP", false, "Female"));
		mlaDTOs.add(new MLADTO("Mahantesh Kaujlagi", 49, "Bailhongal", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Anand Mamani", 67, "Saundatti Yellamma", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Mahadevappa Shivalingappa Yadawad", 43, "Ramdurg", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Govind M. Karjol", 42, "Mudhol", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Siddu Savadi", 46, "Terdal", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Anand Nyamagouda", 48, "Jamkhandi", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Murugesh Nirani", 59, "Bilgi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Siddaramaiah", 70, "Badami", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Veerabhadrayya Charantimath", 65, "Bagalkot", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Doddanagowda Patil", 45, "Hungund", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("A. S. Patil", 45, "Muddebihal", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Somanagouda Patil", 56, "Devar Hippargi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Shivanand S Patil", 50, "Basavana Bagevadi", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("M. B. Patil", 62, "Babaleshwar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Basangouda Patil Yatnal", 53, "Bijapur City", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Devanand Fulasing Chavan", 47, "Nagathan", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Y. V. Patil", 37, "Indi", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Bhusanur Ramesh Balappa", 45, "Sindagi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("M. Y. Patil", 56, "Afzalpur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Ajay Dharam Singh", 40, "Jevargi", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Narasimhanayak", 67, "Shorapur", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Sharanabasappa Gouda Darshanapur", 48, "Shahapur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Venkatreddy Mudnal", 56, "Yadgir", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Naganagowda Kandukar", 59, "Gurmitkal", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Priyank M. Kharge", 67, "Chittapur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Rajkumar Patil", 35, "Sedam", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Avinash Jadhav", 57, "Chincholi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Basavaraj Mattimud", 46, "Gulbarga Rural", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Dattatraya C. Patil", 49, "Gulbarga Dakshin", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Kaneez Fatima", 56, "Gulbarga Uttar", "Congress", false, "Female"));
		mlaDTOs.add(new MLADTO("Guttedar Subhash Rukmayya", 46, "Aland", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Sharanu Salagar", 67, "Basavakalyan", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Rajshekar Basavaraj Patil", 47, "Homnabad", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Bandeppa Kashempur", 42, "Bidar South", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Rahim Khan", 46, "Bidar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Eshwara Bhimanna Khandre", 48, "Bhalki", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Prabhu Chavhan", 59, "Aurad", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Basanagouda Daddal", 70, "Raichur Rural", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Dr. Shivaraj Patil S", 65, "Raichur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Raja Venkatappa Nayak", 45, "Manvi", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Shivanagouda Naik", 45, "Devadurga", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("D. S. Hoolageri", 56, "Lingsugur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Venkatrao Nadagouda", 50, "Sindhanur", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Basanagouda Turvihal", 62, "Maski", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Amaregouda Linganagouda Patil", 53, "Kushtagi", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Basavaraj Dhadesugur", 54, "Kanakagiri", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Paranna Munavalli", 45, "Gangawati", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Achar Halappa Basappa", 39, "Yelburga", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("K. Raghavendra", 56, "Koppal", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Ramappa Lamani", 40, "Shirahatti", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("H. K. Patil", 40, "Gadag", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Kalakappa Bandi", 46, "Ron", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("C. C. Patil", 65, "Nargund", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Patil Munenakoppa Shankar", 59, "Navalgund", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Kusuma Shivalli", 48, "Kundgol", "Congress", false, "Female"));
		mlaDTOs.add(new MLADTO("Amrupayyappa Desai", 50, "Dharwad", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Abbayya Prasad", 55, "Hubli-Dharwad-East", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Jagadish Shettar", 46, "Hubli-Dharwad-Central", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Aravind Bellad", 59, "Hubli-Dharwad-West", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("C. M. Nimbannavar", 47, "Kalghatgi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("R. V. Deshapande", 67, "Haliyal", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("Roopali Naik", 44, "Karwar", "BJP", false, "Female"));
		mlaDTOs.add(new MLADTO("Dinakar Keshav Shetty", 43, "Kumta", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Sunil Biliya Naik", 42, "Bhatkal", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Vishweshwar Hegde", 56, "Sirsi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Arbail Shivaram Hebbar", 48, "Yellapur", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Srinivas Mane", 59, "Hangal", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Basavaraj Bommai", 56, "Shiggaon", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Neharu Olekar", 65, "Haveri(SC)", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Ballary Virupakshappa Rudrappa", 45, "Ranibennur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("B. C. Patil", 46, "Hirekerur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Arunkumar Guththur", 56, "Ranibennur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("P. T. Parameshwar Naik", 50, "Hadagalli", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("L.B.P. Bheemanaik", 56, "Hagaribommanahalli	", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Anand Singh", 53, "Vijayanagara", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("J.N. Ganesh", 47, "Kampli", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("M. S. Somalingappa", 37, "Siruguppa", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("B. Nagendra", 45, "Bellary Rural", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("G. Somashekara Reddy", 56, "Bellary City", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("E. Tukaram", 40, "Sandur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("N. Y. Gopalakrishna", 67, "Kudligi", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("B. Sreeramulu", 48, "Molakalmuru", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("T. Raghumurthy", 56, "Challakere", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("G. H. Thippareddy", 59, "Chitradurga", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Poornima Krishnappa", 67, "Hiriyur", "BJP", true, "Female"));
		mlaDTOs.add(new MLADTO("Gulhatty D. Shekhar", 35, "Hosadurga", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("M. Chandrappa", 57, "Holalkere", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("S. V. Ramachandra", 46, "Jagalur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("G. Karunakara Reddy", 49, "Harapanahalli", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("S. Ramappa", 56, "Harihar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("S. A. Ravindranath", 46, "Davanagere North", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Shamanur Shivashankarappa", 67, "Davanagere South", "Congress", false, "Male"));
		mlaDTOs.add(new MLADTO("N. Linganna", 47, "Mayakonda", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("K. Madal Veerupakshappa", 42, "Channagiri", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("M. P. Renukacharya", 46, "Honnali", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("K. B. Ashok Naik", 48, "Shimoga Rural", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("B.K. Sangameshwara", 59, "Bhadravati", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("K. S. Eshwarappa", 70, "Shimoga", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Araga Jnanendra", 65, "Tirthahalli", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("B. S. Yeddyurappa", 45, "Shikaripura", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Kumar Bangarappa", 45, "Soraba", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Hartalu Halappa", 56, "Sagar", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("B. M. Sukumar Shetty", 50, "Baindur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Halady Srinivas Shetty", 62, "Kundapura", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("K. Raghupati Bhat", 53, "Udupi", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Lalaji Mendon", 54, "Kapu", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("V. Sunil Kumar", 45, "Karkal", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("T. D. Rajegowda", 39, "Sringeri", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("M. P. Kumaraswamy", 56, "Mudigere", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("C. T. Ravi", 40, "Chikmagalur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("D. S. Suresh", 40, "Tarikere", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Belliprakash", 46, "Kadur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("J. C. Madhuswamy", 65, "Chiknayakanhalli", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("B. C. Nagesh", 59, "Tiptur", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Jayaram A S", 48, "Turuvekere", "BJP", false, "Male"));
		mlaDTOs.add(new MLADTO("Dr H.D. Ranganath", 50, "Kunigal", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("G. B. Jyothi Ganesh", 55, "Tumkur City", "BJP", true, "Female"));
		mlaDTOs.add(new MLADTO("D. C. Gowrishankar", 46, "Tumkur Rural", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Dr. G. Parameshwara", 59, "Koratagere", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("S. R. Srinivas", 47, "Gubbi", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("C. M. Rajesh Gowda", 67, "Sira", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Venkata Ramanappa", 44, "Pavagada", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("M.V. Veerabhadraiah", 43, "Madhugiri", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("N. H. Shivashankara Reddy", 42, "Gauribidanur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("S. N. Subbareddy", 56, "Bagepalli", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("K. Sudhakar", 48, "Chikkaballapur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("V. Muniyappa", 59, "Sidlaghatta", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("J. K. Krishnareddy", 56, "Chintamani", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("K. R. Ramesh Kumar", 65, "Srinivasapur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("H. Nagesh", 45, "Mulbagal", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("M. Roopakala", 46, "Kolar Gold Field", "Congress", true, "Female"));
		mlaDTOs.add(new MLADTO("S. N. Narayanaswamy K. M", 56, "Bangarapet", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("K. Srinivasa Gowda", 50, "Kolar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("K. Y. Nanjegowda", 56, "Malur	", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("S. R. Vishwanath", 53, "Yelahanka", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Byrathi Basavaraj", 47, "K. R. Pura", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Krishna Byre Gowda", 37, "Byatarayanapura", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("S. T. Somashekar", 45, "Yeshwanthpur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Munirathna", 56, "Rajarajeshwari Nagar", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("R. Manjunatha", 40, "Dasarahalli", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("K. Gopalaiah", 67, "Mahalakshmi Layout", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Dr. C.N. Ashwath Narayan", 48, "Malleshwaram", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Byrathi Suresh", 56, "Hebbal", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Akhanda Srinivas Murthy", 59, "Pulakeshinagar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("K. J. George", 67, "Sarvagnanagar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("S. Raghu", 35, "C. V. Raman Nagar", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Rizwan Arshad", 57, "Shivajinagar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("N. A. Haris", 46, "Shanti Nagar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Dinesh Gundu Rao", 49, "Gandhi Nagar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("S. Suresh Kumar", 56, "Rajaji Nagar", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("V. Somanna", 46, "Govindraj Nagar", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("M. Krishnappa", 67, "Vijay Nagar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Zameer Ahmed Khan", 47, "Chamrajpet", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Uday B. Garudachar", 42, "Chickpet", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("L. A. Ravi Subramanya", 46, "Basavanagudi", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("R. Ashoka", 48, "Padmanaba Nagar", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Ramalinga Reddy", 59, "B.T.M. Layout", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Soumya Reddy", 70, "Jayanagar", "Congress", true, "Female"));
		mlaDTOs.add(new MLADTO("Aravind Limbavali", 65, "Mahadevapura", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("M Satish Reddy", 45, "Bommanahalli", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("M. Krishnappa", 45, "Bangalore South", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("B.Shivanna", 56, "Anekal", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Sharath Kumar Bachegowda", 50, "Hoskote", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Nisarga Narayanaswamy L.N", 62, "Devanahalli", "Janata Dal", false, "Female"));
		mlaDTOs.add(new MLADTO("T. Venkataramanaiah", 53, "Doddaballapur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Dr. K. Srinavasamurthy", 46, "Nelamangala", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("A. Manjunath", 48, "Magadi", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Anitha Kumaraswamy", 59, "Ramanagara", "Janata Dal", false, "Female"));
		mlaDTOs.add(new MLADTO("D. K. Shivakumar", 70, "Kanakapura", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("H. D. Kumaraswamy", 65, "Channapatna", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Dr. K. Annadani", 45, "Malavalli", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("D. C. Thammanna", 45, "Maddur", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("C. S. Puttaraju", 56, "Melukote", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("M. Srinivas", 50, "Mandya", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Ravindra Srikantaiah", 62, "Shrirangapattana", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Suresh Gowda", 46, "Nagamangala", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Narayana Gowda", 48, "Krishnarajpet", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("C. N. Balakrishna", 59, "Shravanabelagola", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("K. M. Shivalingegowda", 70, "Arsikere", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("K. S. Lingesha", 65, "Belur", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Preetham J. Gowda", 45, "Hassan", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("H. D. Revanna", 45, "Holenarasipur", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("A. T. Ramaswamy", 56, "Arkalgud", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("H. K. Kumaraswamy", 50, "Sakleshpur", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("Harish Poonja", 62, "Belthangady", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Umanatha A. Kotian", 46, "Moodabidri", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Bharath Shetty", 48, "Mangalore City North", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("D. Vedavyas Kamath", 59, "Mangalore City South", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("U. T. Khader", 70, "Mangalore", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Rajesh Naik", 65, "Bantval", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Sanjeeva Matandoor", 45, "Puttur", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Angara S", 45, "Sullia", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Appachu Ranjan", 56, "Madikeri", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("K. G. Bopaiah", 50, "Virajpet", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("K. Mahadeva", 62, "Periyapatna", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("S. R. Mahesh", 46, "Krishnarajanagara", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("H. P. Manjunath", 48, "Hunsuru", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Anil Kumar C.", 59, "Heggadadevankote", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Harshavardhan B.", 70, "Nanjangud", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("GT Devegowda", 65, "Chamundeshwari", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("S. A. Ramadas", 45, "Krishnaraja", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("L. Nagendra", 45, "Chamaraja", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("Tanveer Sait", 56, "Narasimharaja", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Yathindra S.", 50, "Varuna", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("Ashvin Kumar M.", 62, "T Narasipura", "Janata Dal", false, "Male"));
		mlaDTOs.add(new MLADTO("R. Narendra", 45, "Hanur", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("N. Mahesh", 56, "Kollegal", "BJP", true, "Male"));
		mlaDTOs.add(new MLADTO("C. Puttarangashetty", 50, "Chamrajanagar", "Congress", true, "Male"));
		mlaDTOs.add(new MLADTO("C.S. Niranjan Kumar", 62, "Gundlupet", "BJP", true, "Male"));
		
		
		
		
		System.out.println("List of MLA'S where age is greater than 50 ");
		
		mlaDTOs.stream().filter(a->a.getAge()>50).collect(Collectors.toList()) .forEach(name-> System.out.println(name.getName()+ "Age : "+name.getAge()));
		
		System.out.println("List of MLA'S where age is lesser than 50 ");
		
		mlaDTOs.stream().filter(a->a.getAge()<50).collect(Collectors.toList()).forEach(name-> System.out.println(name.getName()+ "Age : "+name.getAge()));

		System.out.println("List of all male MLA'S  ");

		mlaDTOs.stream().filter(a->a.getGender().equals("Male")).collect(Collectors.toList()).forEach(n->  System.out.println(n.getName()) );
		
		System.out.println("List of all female MLA'S  ");

		mlaDTOs.stream().filter(a->a.getGender().equals("Female")).collect(Collectors.toList()).forEach(n->  System.out.println(n.getName()) );

		
		System.out.println("List of MLA'S in ascending order sorted by party ");

		mlaDTOs.stream().sorted((party1,party2)->party1.getParty().compareTo(party2.getParty())).collect(Collectors.toList()).forEach(l->System.out.println(l));
		
		System.out.println("List of MLA'S in ascending order sorted by name");

		mlaDTOs.stream().sorted((name1,name2)->name1.getName().compareTo(name2.getName())).collect(Collectors.toList()).forEach(n->System.out.println(n.toString()));

		
		System.out.println("List of MLA'S in descending order sorted by age ");

		mlaDTOs.stream().sorted((a1,a2)->a2.getAge().compareTo(a1.getAge())).collect(Collectors.toList()).forEach(a->System.out.println(a));

		
		

		
		
		System.out.println("List of MLA'S By party ");

		mlaDTOs.stream().filter(p->p.getParty().equals("Congress")).collect(Collectors.toSet()).forEach(c->System.out.println(c));
		
		System.out.println("List of Unique partys ");

		mlaDTOs.stream().map(up->up.getParty()).collect(Collectors.toSet()).forEach(p->System.out.println(p));
		
		System.out.println("List of Independent MLA'S   ");

		mlaDTOs.stream().filter(i->i.isIndependent()).collect(Collectors.toList()).forEach(i->System.out.println(i.getName()));
		
		System.out.println("List of MLA'S where age is greater than 50 and party is BJP ");

		
		mlaDTOs.stream().filter(a->a.getAge()>50 && a.getParty().equals("BJP")).collect(Collectors.toList()).forEach(n->System.out.println(n.getName()));
		
		
	}

}
