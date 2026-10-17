package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import defpackage.ac;
import defpackage.dq;
import defpackage.fc;
import defpackage.k4;
import defpackage.o;
import defpackage.p7;
import defpackage.q10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = new FontVariation();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(String str, float f) {
            this.axisName = str;
            this.value = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            return q10.b(getAxisName(), settingFloat.getAxisName()) && this.value == settingFloat.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return Float.hashCode(this.value) + (getAxisName().hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getAxisName());
            sb.append("', value=");
            return k4.g(sb, this.value, ')');
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(String str, int i) {
            this.axisName = str;
            this.value = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            return q10.b(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getAxisName());
            sb.append("', value=");
            return fc.e(sb, this.value, ')');
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        public Settings(Setting... settingArr) {
            boolean z = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                int i = 0;
                for (Setting setting2 : settingArr) {
                    if (q10.b(setting2.getAxisName(), axisName)) {
                        i++;
                    }
                }
                if (!(i == 1)) {
                    StringBuilder sb = new StringBuilder("'");
                    sb.append(axisName);
                    sb.append("' must be unique. Actual [");
                    ArrayList arrayList = new ArrayList();
                    for (Setting setting3 : settingArr) {
                        if (q10.b(setting3.getAxisName(), axisName)) {
                            arrayList.add(setting3);
                        }
                    }
                    sb.append(arrayList);
                    sb.append(']');
                    InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
                }
                z = z || setting.getNeedsDensity();
            }
            this.settings = ac.n0(settingArr);
            this.needsDensity = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && q10.b(this.settings, ((Settings) obj).settings);
        }

        public final boolean getNeedsDensity$ui_text() {
            return this.needsDensity;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private FontVariation() {
    }

    public final Setting Setting(String str, float f) {
        if (!(str.length() == 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new SettingFloat(str, f);
    }

    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m7195Settings6EWAqTQ(FontWeight fontWeight, int i, Setting... settingArr) {
        p7 p7Var = new p7(3);
        p7Var.b(weight(fontWeight.getWeight()));
        p7Var.b(italic(i));
        p7Var.e(settingArr);
        ArrayList arrayList = (ArrayList) p7Var.d;
        return new Settings((Setting[]) arrayList.toArray(new Setting[arrayList.size()]));
    }

    public final Setting grade(int i) {
        boolean z = false;
        if (-1000 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new SettingInt("GRAD", i);
    }

    public final Setting italic(float f) {
        boolean z = false;
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: " + f);
        }
        return new SettingFloat("ital", f);
    }

    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m7196opticalSizingR2X_6o(long j) {
        if (!TextUnit.m7808isSpimpl(j)) {
            InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
        }
        return new SettingTextUnit("opsz", j, null);
    }

    public final Setting slant(float f) {
        boolean z = false;
        if (-90.0f <= f && f <= 90.0f) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: " + f);
        }
        return new SettingFloat("slnt", f);
    }

    public final Setting weight(int i) {
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        return new SettingInt("wght", i);
    }

    public final Setting width(float f) {
        if (!(f > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: " + f);
        }
        return new SettingFloat("wdth", f);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        private SettingTextUnit(String str, long j) {
            this.axisName = str;
            this.value = j;
            this.needsDensity = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            return q10.b(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m7802equalsimpl0(this.value, settingTextUnit.value);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m7197getValueXSAIIZE() {
            return this.value;
        }

        public int hashCode() {
            return TextUnit.m7806hashCodeimpl(this.value) + (getAxisName().hashCode() * 31);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m7812toStringimpl(this.value)) + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density != null) {
                return density.getFontScale() * TextUnit.m7805getValueimpl(this.value);
            }
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            o.j();
            return 0.0f;
        }

        public /* synthetic */ SettingTextUnit(String str, long j, dq dqVar) {
            this(str, j);
        }
    }
}
