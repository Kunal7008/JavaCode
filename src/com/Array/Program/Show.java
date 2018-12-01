package com.Array.Program;
class Job{
	int x,y,z;
	public Job(int x,int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Job(Job job) {
		this.x=job.x;
		this.y=job.y;
		this.z=job.z;
	}
	
}
public class Show {

	public static void main(String[] args) {
		Job job= new Job(10, 11, 45);
		//System.out.println(job.x);
		Job job1=new Job(job);//shallow copy
		job1.x=13;
		System.out.println(job.x);
		System.out.println(job1.x);

	}

}
