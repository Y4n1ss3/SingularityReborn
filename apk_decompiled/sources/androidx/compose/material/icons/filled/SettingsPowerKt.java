package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsPowerKt {
    private static ImageVector _settingsPower;

    public static final ImageVector getSettingsPower(Icons.Filled filled) {
        ImageVector imageVector = _settingsPower;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsPower", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 24.0f, 2.0f, -2.0f);
        bv.r(b, 7.0f, 22.0f, 2.0f);
        k4.C(b, 11.0f, 24.0f, 2.0f, -2.0f);
        fc.x(b, -2.0f, 2.0f, 13.0f, 2.0f);
        kf0.x(b, -2.0f, 10.0f, 2.0f);
        uo.l(b, 13.0f, 2.0f, 16.56f, 4.44f);
        b.lineToRelative(-1.45f, 1.45f);
        b.curveTo(16.84f, 6.94f, 18.0f, 8.83f, 18.0f, 11.0f);
        b.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        b.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        b.curveToRelative(0.0f, -2.17f, 1.16f, -4.06f, 2.88f, -5.12f);
        b.lineTo(7.44f, 4.44f);
        b.curveTo(5.36f, 5.88f, 4.0f, 8.28f, 4.0f, 11.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.curveToRelative(0.0f, -2.72f, -1.36f, -5.12f, -3.44f, -6.56f);
        r6.B(b, 15.0f, 24.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(b, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsPower = build;
        build.getClass();
        return build;
    }
}
