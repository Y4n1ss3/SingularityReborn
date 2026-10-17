package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BatteryAlertKt {
    private static ImageVector _batteryAlert;

    public static final ImageVector getBatteryAlert(Icons.TwoTone twoTone) {
        ImageVector imageVector = _batteryAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BatteryAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.67f, 4.0f, 14.0f, 4.0f);
        fc.w(i, 14.0f, 2.0f, -4.0f, 2.0f);
        i.lineTo(8.33f, 4.0f);
        i.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        i.verticalLineToRelative(15.33f);
        i.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.33f, 22.0f);
        i.horizontalLineToRelative(7.33f);
        i.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        i.lineTo(17.0f, 5.33f);
        i.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        r6.B(i, 13.0f, 18.0f, -2.0f, -2.0f);
        fc.x(i, 2.0f, 2.0f, 13.0f, 14.0f);
        uo.n(i, -2.0f, 11.0f, 9.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(i, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryAlert = build;
        build.getClass();
        return build;
    }
}
