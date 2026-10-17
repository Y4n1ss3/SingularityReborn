package androidx.compose.runtime.composer.linkbuffer.changelist;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposerChangeListWriterAddressMode {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ ComposerChangeListWriterAddressMode[] $VALUES;
    public static final ComposerChangeListWriterAddressMode AbsoluteAddressing = new ComposerChangeListWriterAddressMode("AbsoluteAddressing", 0);
    public static final ComposerChangeListWriterAddressMode AnchorAddressing = new ComposerChangeListWriterAddressMode("AnchorAddressing", 1);
    public static final ComposerChangeListWriterAddressMode RelativeAddressing = new ComposerChangeListWriterAddressMode("RelativeAddressing", 2);

    private static final /* synthetic */ ComposerChangeListWriterAddressMode[] $values() {
        return new ComposerChangeListWriterAddressMode[]{AbsoluteAddressing, AnchorAddressing, RelativeAddressing};
    }

    static {
        ComposerChangeListWriterAddressMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private ComposerChangeListWriterAddressMode(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static ComposerChangeListWriterAddressMode valueOf(String str) {
        return (ComposerChangeListWriterAddressMode) Enum.valueOf(ComposerChangeListWriterAddressMode.class, str);
    }

    public static ComposerChangeListWriterAddressMode[] values() {
        return (ComposerChangeListWriterAddressMode[]) $VALUES.clone();
    }
}
