// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.CreationData;
import com.azure.resourcemanager.compute.models.DiskSku;
import com.azure.resourcemanager.compute.models.DiskState;
import com.azure.resourcemanager.compute.models.Encryption;
import com.azure.resourcemanager.compute.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.models.ExtendedLocation;
import com.azure.resourcemanager.compute.models.HyperVGeneration;
import com.azure.resourcemanager.compute.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.models.ShareInfoElement;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Disk resource. */
@JsonFlatten
@Fluent
public class DiskInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskInner.class);

    /*
     * A relative URI containing the ID of the VM that has the disk attached.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /*
     * List of relative URIs containing the IDs of the VMs that have the disk
     * attached. maxShares should be set to a value greater than one for disks
     * to allow attaching them to multiple VMs.
     */
    @JsonProperty(value = "managedByExtended", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> managedByExtended;

    /*
     * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS,
     * or UltraSSD_LRS.
     */
    @JsonProperty(value = "sku")
    private DiskSku sku;

    /*
     * The Logical zone list for Disk.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The extended location where the disk will be created. Extended location
     * cannot be changed.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * The time when the disk was created.
     */
    @JsonProperty(value = "properties.timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /*
     * The Operating System type.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * Purchase plan information for the the image from which the OS disk was
     * created. E.g. - {name: 2019-Datacenter, publisher:
     * MicrosoftWindowsServer, product: WindowsServer}
     */
    @JsonProperty(value = "properties.purchasePlan")
    private PurchasePlanAutoGenerated purchasePlan;

    /*
     * Disk source information. CreationData information cannot be changed
     * after the disk has been created.
     */
    @JsonProperty(value = "properties.creationData")
    private CreationData creationData;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The size of the disk in bytes. This field is read only.
     */
    @JsonProperty(value = "properties.diskSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskSizeBytes;

    /*
     * Unique Guid identifying the resource.
     */
    @JsonProperty(value = "properties.uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /*
     * Encryption settings collection used for Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * The disk provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The number of IOPS allowed for this disk; only settable for UltraSSD
     * disks. One operation can transfer between 4k and 256k bytes.
     */
    @JsonProperty(value = "properties.diskIOPSReadWrite")
    private Long diskIopsReadWrite;

    /*
     * The bandwidth allowed for this disk; only settable for UltraSSD disks.
     * MBps means millions of bytes per second - MB here uses the ISO notation,
     * of powers of 10.
     */
    @JsonProperty(value = "properties.diskMBpsReadWrite")
    private Long diskMBpsReadWrite;

    /*
     * The total number of IOPS that will be allowed across all VMs mounting
     * the shared disk as ReadOnly. One operation can transfer between 4k and
     * 256k bytes.
     */
    @JsonProperty(value = "properties.diskIOPSReadOnly")
    private Long diskIopsReadOnly;

    /*
     * The total throughput (MBps) that will be allowed across all VMs mounting
     * the shared disk as ReadOnly. MBps means millions of bytes per second -
     * MB here uses the ISO notation, of powers of 10.
     */
    @JsonProperty(value = "properties.diskMBpsReadOnly")
    private Long diskMBpsReadOnly;

    /*
     * The state of the disk.
     */
    @JsonProperty(value = "properties.diskState", access = JsonProperty.Access.WRITE_ONLY)
    private DiskState diskState;

    /*
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /*
     * The maximum number of VMs that can attach to the disk at the same time.
     * Value greater than one indicates a disk that can be mounted on multiple
     * VMs at the same time.
     */
    @JsonProperty(value = "properties.maxShares")
    private Integer maxShares;

    /*
     * Details of the list of all VMs that have the disk attached. maxShares
     * should be set to a value greater than one for disks to allow attaching
     * them to multiple VMs.
     */
    @JsonProperty(value = "properties.shareInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<ShareInfoElement> shareInfo;

    /*
     * Policy for accessing the disk via network.
     */
    @JsonProperty(value = "properties.networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /*
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "properties.diskAccessId")
    private String diskAccessId;

    /*
     * Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does
     * not apply to Ultra disks.
     */
    @JsonProperty(value = "properties.tier")
    private String tier;

    /*
     * Set to true to enable bursting beyond the provisioned performance target
     * of the disk. Bursting is disabled by default. Does not apply to Ultra
     * disks.
     */
    @JsonProperty(value = "properties.burstingEnabled")
    private Boolean burstingEnabled;

    /**
     * Get the managedBy property: A relative URI containing the ID of the VM that has the disk attached.
     *
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the managedByExtended property: List of relative URIs containing the IDs of the VMs that have the disk
     * attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     *
     * @return the managedByExtended value.
     */
    public List<String> managedByExtended() {
        return this.managedByExtended;
    }

    /**
     * Get the sku property: The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, or UltraSSD_LRS.
     *
     * @return the sku value.
     */
    public DiskSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, or UltraSSD_LRS.
     *
     * @param sku the sku value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withSku(DiskSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones property: The Logical zone list for Disk.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The Logical zone list for Disk.
     *
     * @param zones the zones value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location where the disk will be created. Extended location cannot
     * be changed.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location where the disk will be created. Extended location cannot
     * be changed.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the timeCreated property: The time when the disk was created.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The Operating System type.
     *
     * @param osType the osType value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}.
     *
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: Disk source information. CreationData information cannot be changed after the disk
     * has been created.
     *
     * @param creationData the creationData value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the diskSizeBytes property: The size of the disk in bytes. This field is read only.
     *
     * @return the diskSizeBytes value.
     */
    public Long diskSizeBytes() {
        return this.diskSizeBytes;
    }

    /**
     * Get the uniqueId property: Unique Guid identifying the resource.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used for Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used for Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the provisioningState property: The disk provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.diskIopsReadWrite;
    }

    /**
     * Set the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIopsReadWrite the diskIopsReadWrite value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskIopsReadWrite(Long diskIopsReadWrite) {
        this.diskIopsReadWrite = diskIopsReadWrite;
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Get the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIopsReadOnly value.
     */
    public Long diskIopsReadOnly() {
        return this.diskIopsReadOnly;
    }

    /**
     * Set the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIopsReadOnly the diskIopsReadOnly value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskIopsReadOnly(Long diskIopsReadOnly) {
        this.diskIopsReadOnly = diskIopsReadOnly;
        return this;
    }

    /**
     * Get the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     *
     * @return the diskMBpsReadOnly value.
     */
    public Long diskMBpsReadOnly() {
        return this.diskMBpsReadOnly;
    }

    /**
     * Set the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     *
     * @param diskMBpsReadOnly the diskMBpsReadOnly value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        this.diskMBpsReadOnly = diskMBpsReadOnly;
        return this;
    }

    /**
     * Get the diskState property: The state of the disk.
     *
     * @return the diskState value.
     */
    public DiskState diskState() {
        return this.diskState;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @return the maxShares value.
     */
    public Integer maxShares() {
        return this.maxShares;
    }

    /**
     * Set the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @param maxShares the maxShares value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withMaxShares(Integer maxShares) {
        this.maxShares = maxShares;
        return this;
    }

    /**
     * Get the shareInfo property: Details of the list of all VMs that have the disk attached. maxShares should be set
     * to a value greater than one for disks to allow attaching them to multiple VMs.
     *
     * @return the shareInfo value.
     */
    public List<ShareInfoElement> shareInfo() {
        return this.shareInfo;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @param tier the tier value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of the
     * disk. Bursting is disabled by default. Does not apply to Ultra disks.
     *
     * @return the burstingEnabled value.
     */
    public Boolean burstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * Set the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of the
     * disk. Bursting is disabled by default. Does not apply to Ultra disks.
     *
     * @param burstingEnabled the burstingEnabled value to set.
     * @return the DiskInner object itself.
     */
    public DiskInner withBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DiskInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DiskInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (purchasePlan() != null) {
            purchasePlan().validate();
        }
        if (creationData() != null) {
            creationData().validate();
        }
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (shareInfo() != null) {
            shareInfo().forEach(e -> e.validate());
        }
    }
}
