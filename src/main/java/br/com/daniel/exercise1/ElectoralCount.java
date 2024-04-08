package br.com.daniel.exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ElectoralCount {
    private Integer totalVotes;
    private Integer validVotes;
    private Integer blankVotes;
    private Integer nullVotes;


    public BigDecimal getPercentageBlankVotes(){
        return getPercentage(blankVotes, totalVotes);
    }

    public BigDecimal getPercentageNullVotes(){
        return getPercentage(nullVotes, totalVotes);
    }

    public BigDecimal getPercentageValidVotes(){
        return getPercentage(validVotes, totalVotes);
    }

    private BigDecimal getPercentage(Integer numerator, Integer denominator){
        return BigDecimal.valueOf(numerator).divide(BigDecimal.valueOf(denominator), 2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
    }

    public ElectoralCount(Integer totalVotes, Integer validVotes, Integer blankVotes, Integer nullVotes) {
        this.totalVotes = totalVotes;
        this.validVotes = validVotes;
        this.blankVotes = blankVotes;
        this.nullVotes = nullVotes;
    }

    public ElectoralCount() {
    }

    public Integer getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Integer getValidVotes() {
        return validVotes;
    }

    public void setValidVotes(Integer validVotes) {
        this.validVotes = validVotes;
    }

    public Integer getBlankVotes() {
        return blankVotes;
    }

    public void setBlankVotes(Integer blankVotes) {
        this.blankVotes = blankVotes;
    }

    public Integer getNullVotes() {
        return nullVotes;
    }

    public void setNullVotes(Integer nullVotes) {
        this.nullVotes = nullVotes;
    }
}
