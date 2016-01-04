/**
 * 
 */
package employeeManagement.companyDatabase.salary;

/**
 * @author parkar_s
 * 
 */
public class Salary {
	private double ctc;
	private double basic;
	private double hra;
	private double pf;
	private double conveyance;
	private double fixedAllowance;
	private double mealCoupon;
	private double giftCard;
	private double medicalReimbursement;
	private double leavetravelAllowance;
	private double gratuty;

	/**
	 * @return the ctc
	 */
	public double getCtc() {
		return ctc;
	}

	/**
	 * @param ctc
	 *            the ctc to set
	 */
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	/**
	 * @return the basic
	 */
	public double getBasic() {
		this.basic = this.ctc * (0.30);
		return basic;
	}

	/**
	 * @param basic
	 *            the basic to set
	 */
	public void setBasic(double basic) {
		this.basic = this.ctc * (0.30);
	}

	/**
	 * @return the hra
	 */
	public double getHra() {
		this.hra = this.basic * (0.50);
		return hra;
	}

	/**
	 * @param hra
	 *            the hra to set
	 */
	public void setHra(double hra) {
		this.hra = this.basic * (0.50);
	}

	/**
	 * @return the pf
	 */
	public double getPf() {
		this.pf = this.basic * (0.12);
		return pf;
	}

	/**
	 * @param pf
	 *            the pf to set
	 */
	public void setPf(double pf) {
		this.pf = this.basic * (0.12);
	}

	/**
	 * @return the conveyance
	 */
	public double getConveyance() {
		this.conveyance = this.basic * (0.09142857);
		return conveyance;
	}

	/**
	 * @param conveyance
	 *            the conveyance to set
	 */
	public void setConveyance(double conveyance) {
		this.conveyance = this.basic * (0.09142857);
	}

	/**
	 * @return the fixedAllowance
	 */
	public double getFixedAllowance() {
		this.fixedAllowance = this.ctc * (0.34300);
		return fixedAllowance;
	}

	/**
	 * @param fixedAllowance
	 *            the fixedAllowance to set
	 */
	public void setFixedAllowance(double fixedAllowance) {
		this.fixedAllowance = this.ctc * (0.34300571428);
	}

	/**
	 * @return the mealCoupon
	 */
	public double getMealCoupon() {
		this.mealCoupon = this.basic * (0.12571);
		return mealCoupon;
	}

	/**
	 * @param mealCoupon
	 *            the mealCoupon to set
	 */
	public void setMealCoupon(double mealCoupon) {
		this.mealCoupon = this.basic * (0.12571);
	}

	/**
	 * @return the giftCard
	 */
	public double getGiftCard() {
		this.giftCard = this.basic * (0.047619);
		return giftCard;
	}

	/**
	 * @param giftCard
	 *            the giftCard to set
	 */
	public void setGiftCard(double giftCard) {
		this.giftCard = this.basic * (0.047619);
	}

	/**
	 * @return the medicalReimbursement
	 */
	public double getMedicalReimbursement() {
		this.medicalReimbursement = this.basic * (0.142857);
		return medicalReimbursement;
	}

	/**
	 * @param medicalReimbursement
	 *            the medicalReimbursement to set
	 */
	public void setMedicalReimbursement(double medicalReimbursement) {
		this.medicalReimbursement = this.basic * (0.142857);
	}

	/**
	 * @return the leavetravelAllowance
	 */
	public double getLeavetravelAllowance() {
		this.leavetravelAllowance = this.basic * (0.114285);
		return leavetravelAllowance;
	}

	/**
	 * @param leavetravelAllowance
	 *            the leavetravelAllowance to set
	 */
	public void setLeavetravelAllowance(double leavetravelAllowance) {
		this.leavetravelAllowance = this.basic * (0.114285);
	}

	/**
	 * @return the gratuty
	 */
	public double getGratuty() {
		this.gratuty = this.basic * (0.048076);
		return gratuty;
	}

	/**
	 * @param gratuty
	 *            the gratuty to set
	 */
	public void setGratuty(double gratuty) {
		this.gratuty = this.basic * (0.048076);
	}

	public static void main(String[] args) {
		Salary sal = new Salary();
		sal.setCtc(350000);
		System.out.println("\n" + sal.getBasic() + "\n" + sal.getConveyance()
				+ "\n" + sal.getFixedAllowance() + "\n" + sal.getGiftCard()
				+ "\n" + sal.getGratuty() + "\n" + sal.getHra() + "\n"
				+ sal.getLeavetravelAllowance() + "\n" + sal.getMealCoupon()
				+ "\n" + sal.getMedicalReimbursement() + "\n" + sal.getPf());
	}
}
