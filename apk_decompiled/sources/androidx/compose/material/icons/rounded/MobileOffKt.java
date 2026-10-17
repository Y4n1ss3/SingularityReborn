package androidx.compose.material.icons.rounded;

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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileOffKt {
    private static ImageVector _mobileOff;

    public static final ImageVector getMobileOff(Icons.Rounded rounded) {
        ImageVector imageVector = _mobileOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MobileOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 16.44f, 3.61f, 3.05f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineTo(5.0f, 7.27f);
        i.verticalLineTo(21.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.02f, 0.0f, 1.85f, -0.77f, 1.98f, -1.75f);
        i.lineTo(20.0f, 22.27f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        bv.o(i, 19.0f, 18.44f, -2.0f, -2.0f);
        i.moveTo(7.0f, 19.0f);
        i.verticalLineTo(9.27f);
        i.lineTo(16.73f, 19.0f);
        i.horizontalLineTo(7.0f);
        i.close();
        i.moveTo(17.0f, 5.0f);
        k4.z(i, 8.61f, 2.0f, 2.0f, 3.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.horizontalLineTo(7.0f);
        i.curveToRelative(-0.71f, 0.0f, -1.33f, 0.37f, -1.68f, 0.93f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(i, 8.39f, 5.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileOff = build;
        build.getClass();
        return build;
    }
}
