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
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkEraseKt {
    private static ImageVector _phonelinkErase;

    public static final ImageVector getPhonelinkErase(Icons.Rounded rounded) {
        ImageVector imageVector = _phonelinkErase;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhonelinkErase", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 7.7f);
        b.curveToRelative(-0.28f, -0.28f, -0.72f, -0.28f, -1.0f, 0.0f);
        b.lineTo(8.0f, 11.2f);
        b.lineTo(4.5f, 7.7f);
        b.curveToRelative(-0.28f, -0.28f, -0.72f, -0.28f, -1.0f, 0.0f);
        b.reflectiveCurveToRelative(-0.28f, 0.72f, 0.0f, 1.0f);
        b.lineTo(7.0f, 12.2f);
        b.lineToRelative(-3.5f, 3.5f);
        b.curveToRelative(-0.28f, 0.28f, -0.28f, 0.72f, 0.0f, 1.0f);
        b.reflectiveCurveToRelative(0.72f, 0.28f, 1.0f, 0.0f);
        b.lineTo(8.0f, 13.2f);
        b.lineToRelative(3.5f, 3.5f);
        b.curveToRelative(0.28f, 0.28f, 0.72f, 0.28f, 1.0f, 0.0f);
        b.reflectiveCurveToRelative(0.28f, -0.72f, 0.0f, -1.0f);
        b.lineTo(9.0f, 12.2f);
        b.lineToRelative(3.5f, -3.5f);
        b.curveToRelative(0.28f, -0.28f, 0.28f, -0.72f, 0.0f, -1.0f);
        r6.g(b, 19.0f, 1.0f, 9.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        j50.B(b, 4.0f, 10.0f, 16.0f, 9.0f);
        b.verticalLineToRelative(-1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineTo(3.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkErase = build;
        build.getClass();
        return build;
    }
}
