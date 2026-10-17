package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ToolbarHandlerState {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ ToolbarHandlerState[] $VALUES;
    public static final ToolbarHandlerState Uninitialized = new ToolbarHandlerState("Uninitialized", 0);
    public static final ToolbarHandlerState Detached = new ToolbarHandlerState("Detached", 1);
    public static final ToolbarHandlerState Attached = new ToolbarHandlerState("Attached", 2);

    private static final /* synthetic */ ToolbarHandlerState[] $values() {
        return new ToolbarHandlerState[]{Uninitialized, Detached, Attached};
    }

    static {
        ToolbarHandlerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private ToolbarHandlerState(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static ToolbarHandlerState valueOf(String str) {
        return (ToolbarHandlerState) Enum.valueOf(ToolbarHandlerState.class, str);
    }

    public static ToolbarHandlerState[] values() {
        return (ToolbarHandlerState[]) $VALUES.clone();
    }
}
