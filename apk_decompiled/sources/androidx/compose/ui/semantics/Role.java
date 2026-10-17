package androidx.compose.ui.semantics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m6822constructorimpl(0);
    private static final int Checkbox = m6822constructorimpl(1);
    private static final int Switch = m6822constructorimpl(2);
    private static final int RadioButton = m6822constructorimpl(3);
    private static final int Tab = m6822constructorimpl(4);
    private static final int Image = m6822constructorimpl(5);
    private static final int DropdownList = m6822constructorimpl(6);
    private static final int ValuePicker = m6822constructorimpl(7);
    private static final int Carousel = m6822constructorimpl(8);

    private /* synthetic */ Role(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m6821boximpl(int i) {
        return new Role(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6823equalsimpl(int i, Object obj) {
        return (obj instanceof Role) && i == ((Role) obj).m6827unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6824equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6825hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6826toStringimpl(int i) {
        return m6824equalsimpl0(i, Button) ? "Button" : m6824equalsimpl0(i, Checkbox) ? "Checkbox" : m6824equalsimpl0(i, Switch) ? "Switch" : m6824equalsimpl0(i, RadioButton) ? "RadioButton" : m6824equalsimpl0(i, Tab) ? "Tab" : m6824equalsimpl0(i, Image) ? "Image" : m6824equalsimpl0(i, DropdownList) ? "DropdownList" : m6824equalsimpl0(i, ValuePicker) ? "Picker" : m6824equalsimpl0(i, Carousel) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m6823equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6825hashCodeimpl(this.value);
    }

    public String toString() {
        return m6826toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6827unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m6828getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m6829getCarouselo7Vup1c() {
            return Role.Carousel;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m6830getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m6831getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m6832getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m6833getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m6834getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m6835getTabo7Vup1c() {
            return Role.Tab;
        }

        /* renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m6836getValuePickero7Vup1c() {
            return Role.ValuePicker;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6822constructorimpl(int i) {
        return i;
    }
}
