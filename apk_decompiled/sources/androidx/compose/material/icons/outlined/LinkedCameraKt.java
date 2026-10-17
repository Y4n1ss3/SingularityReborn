package androidx.compose.material.icons.outlined;

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
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkedCameraKt {
    private static ImageVector _linkedCamera;

    public static final ImageVector getLinkedCamera(Icons.Outlined outlined) {
        ImageVector imageVector = _linkedCamera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LinkedCamera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(20.0f, 9.0f, 11.0f, 4.0f, 20.0f);
        y.lineTo(4.0f, 8.0f);
        y.horizontalLineToRelative(4.05f);
        y.lineToRelative(1.83f, -2.0f);
        y.lineTo(15.0f, 6.0f);
        y.lineTo(15.0f, 4.0f);
        y.lineTo(9.0f, 4.0f);
        y.lineTo(7.17f, 6.0f);
        y.lineTo(4.0f, 6.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        y.verticalLineToRelative(12.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(16.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        uf.j(y, 22.0f, 9.0f, -2.0f);
        y.moveTo(20.67f, 7.99f);
        y.lineTo(22.0f, 7.99f);
        y.curveTo(21.99f, 4.68f, 19.31f, 2.0f, 16.0f, 2.0f);
        y.verticalLineToRelative(1.33f);
        y.curveToRelative(2.58f, 0.0f, 4.66f, 2.08f, 4.67f, 4.66f);
        af0.l(y, 18.0f, 7.99f, 1.33f);
        y.curveToRelative(-0.01f, -1.84f, -1.49f, -3.32f, -3.33f, -3.32f);
        y.lineTo(16.0f, 6.0f);
        y.curveToRelative(1.11f, 0.0f, 1.99f, 0.89f, 2.0f, 1.99f);
        y.close();
        y.moveTo(7.0f, 14.0f);
        y.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        y.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        y.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        y.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        y.close();
        y.moveTo(15.0f, 14.0f);
        y.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        y.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        y.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(y, 3.0f, 1.34f, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkedCamera = build;
        build.getClass();
        return build;
    }
}
