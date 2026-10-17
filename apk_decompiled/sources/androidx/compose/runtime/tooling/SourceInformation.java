package androidx.compose.runtime.tooling;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SourceInformation {
    public static final int $stable = 8;
    private final String functionName;
    private final boolean isCall;
    private final boolean isInline;
    private final List<LocationSourceInformation> locations;
    private final String packageHash;
    private final List<ParameterSourceInformation> parameters;
    private final String rawData;
    private final String sourceFile;

    public SourceInformation(boolean z, boolean z2, String str, String str2, List<ParameterSourceInformation> list, String str3, List<LocationSourceInformation> list2, String str4) {
        this.isCall = z;
        this.isInline = z2;
        this.functionName = str;
        this.sourceFile = str2;
        this.parameters = list;
        this.packageHash = str3;
        this.locations = list2;
        this.rawData = str4;
    }

    public final String getFunctionName() {
        return this.functionName;
    }

    public final List<LocationSourceInformation> getLocations() {
        return this.locations;
    }

    public final String getPackageHash() {
        return this.packageHash;
    }

    public final List<ParameterSourceInformation> getParameters() {
        return this.parameters;
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final boolean isCall() {
        return this.isCall;
    }

    public final boolean isInline() {
        return this.isInline;
    }
}
