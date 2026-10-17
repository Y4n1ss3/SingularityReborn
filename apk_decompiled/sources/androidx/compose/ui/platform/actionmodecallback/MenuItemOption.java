package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import defpackage.bu;
import defpackage.o;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MenuItemOption {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ MenuItemOption[] $VALUES;
    private final int id;
    private final int order;
    public static final MenuItemOption Copy = new MenuItemOption("Copy", 0, R.id.copy, 0);
    public static final MenuItemOption Paste = new MenuItemOption("Paste", 1, R.id.paste, 1);
    public static final MenuItemOption Cut = new MenuItemOption("Cut", 2, R.id.cut, 2);
    public static final MenuItemOption SelectAll = new MenuItemOption("SelectAll", 3, R.id.selectAll, 3);
    public static final MenuItemOption Autofill = new MenuItemOption("Autofill", 4, R.id.autofill, 4);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[MenuItemOption.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemOption.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemOption.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemOption.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ MenuItemOption[] $values() {
        return new MenuItemOption[]{Copy, Paste, Cut, SelectAll, Autofill};
    }

    static {
        MenuItemOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private MenuItemOption(String str, int i, int i2, int i3) {
        this.id = i2;
        this.order = i3;
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return R.string.copy;
        }
        if (i == 2) {
            return R.string.paste;
        }
        if (i == 3) {
            return R.string.cut;
        }
        if (i == 4) {
            return R.string.selectAll;
        }
        if (i == 5) {
            return R.string.autofill;
        }
        o.n();
        return 0;
    }
}
