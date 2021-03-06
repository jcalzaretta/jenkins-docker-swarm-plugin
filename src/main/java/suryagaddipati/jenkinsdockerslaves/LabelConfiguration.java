package suryagaddipati.jenkinsdockerslaves;

import org.apache.commons.lang.StringUtils;
import org.kohsuke.stapler.DataBoundConstructor;

public   class LabelConfiguration {
    String image;
    String hostBinds;
    private Integer cpus;
    private Long memory;

    @DataBoundConstructor
    public LabelConfiguration(String image, String hostBinds, String label, String cacheDir, Integer cpus, Long memory) {
        this.image = image;
        this.hostBinds = hostBinds;
        this.label = label;
        this.cacheDir = cacheDir;
        this.cpus = cpus;
        this.memory = memory;
    }

    private String label;

    public String getCacheDir() {
        return cacheDir;
    }
    public String[] getCacheDirs() {
        return  StringUtils.isEmpty(cacheDir)? new String[]{}: cacheDir.split(" ");
    }

    public void setCacheDir(String cacheDir) {
        this.cacheDir = cacheDir;
    }

    private String cacheDir;


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public void setHostBinds(String hostBinds) {
        this.hostBinds = hostBinds;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getHostBinds() {
        return hostBinds;
    }

    public String getImage() {
        return image;
    }
    public String[] getHostBindsConfig() {
        return StringUtils.isEmpty( this.hostBinds)? new String[]{}: this.hostBinds.split(" ");
    }

    public Integer getCpus() {
        return cpus;
    }

    public void setCpus(Integer cpus) {
        this.cpus = cpus;
    }

    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }
}
