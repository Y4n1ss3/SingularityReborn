package androidx.compose.ui.focus;

import defpackage.bu;
import defpackage.o;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusStateImpl implements FocusState {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ FocusStateImpl[] $VALUES;
    public static final FocusStateImpl Active = new FocusStateImpl("Active", 0);
    public static final FocusStateImpl ActiveParent = new FocusStateImpl("ActiveParent", 1);
    public static final FocusStateImpl Captured = new FocusStateImpl("Captured", 2);
    public static final FocusStateImpl Inactive = new FocusStateImpl("Inactive", 3);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FocusStateImpl[] $values() {
        return new FocusStateImpl[]{Active, ActiveParent, Captured, Inactive};
    }

    static {
        FocusStateImpl[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private FocusStateImpl(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) $VALUES.clone();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        o.n();
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        o.n();
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        o.n();
        return false;
    }
}
