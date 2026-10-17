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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyboardHideKt {
    private static ImageVector _keyboardHide;

    public static final ImageVector getKeyboardHide(Icons.Rounded rounded) {
        ImageVector imageVector = _keyboardHide;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.KeyboardHide", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 3.0f, 4.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.lineTo(2.0f, 15.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(i, 11.0f, 6.0f, 2.0f, 2.0f);
        gy.n(i, -2.0f, 11.0f, 6.0f);
        k4.C(i, 11.0f, 9.0f, 2.0f, 2.0f);
        gy.n(i, -2.0f, 11.0f, 9.0f);
        k4.C(i, 8.0f, 6.0f, 2.0f, 2.0f);
        r6.C(i, 8.0f, 8.0f, 8.0f, 6.0f);
        k4.C(i, 8.0f, 9.0f, 2.0f, 2.0f);
        r6.C(i, 8.0f, 11.0f, 8.0f, 9.0f);
        i.moveTo(7.0f, 11.0f);
        i.lineTo(5.0f, 11.0f);
        r6.m(i, 5.0f, 9.0f, 2.0f, 2.0f);
        i.moveTo(7.0f, 8.0f);
        i.lineTo(5.0f, 8.0f);
        r6.m(i, 5.0f, 6.0f, 2.0f, 2.0f);
        i.moveTo(15.0f, 15.0f);
        i.lineTo(9.0f, 15.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(6.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        af0.l(i, 16.0f, 11.0f, -2.0f);
        r6.m(i, 14.0f, 9.0f, 2.0f, 2.0f);
        i.moveTo(16.0f, 8.0f);
        uo.n(i, -2.0f, 14.0f, 6.0f, 2.0f);
        bv.m(i, 2.0f, 19.0f, 11.0f, -2.0f);
        r6.m(i, 17.0f, 9.0f, 2.0f, 2.0f);
        i.moveTo(19.0f, 8.0f);
        uo.n(i, -2.0f, 17.0f, 6.0f, 2.0f);
        r6.l(i, 2.0f, 12.35f, 22.65f);
        i.lineToRelative(2.79f, -2.79f);
        i.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        i.lineTo(9.21f, 19.01f);
        i.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        i.lineToRelative(2.79f, 2.79f);
        i.curveToRelative(0.19f, 0.19f, 0.51f, 0.19f, 0.7f, 0.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardHide = build;
        build.getClass();
        return build;
    }
}
