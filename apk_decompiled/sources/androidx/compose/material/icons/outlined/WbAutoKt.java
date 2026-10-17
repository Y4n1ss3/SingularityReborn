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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbAutoKt {
    private static ImageVector _wbAuto;

    public static final ImageVector getWbAuto(Icons.Outlined outlined) {
        ImageVector imageVector = _wbAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WbAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(7.0f, 7.0f, -3.2f, 9.0f, 1.9f);
        b.lineToRelative(0.7f, -2.0f);
        kf0.B(b, 3.2f, 0.7f, 2.0f, 1.9f);
        r6.C(b, 9.0f, 7.0f, 7.0f, 7.0f);
        b.moveTo(6.85f, 12.65f);
        b.lineTo(8.0f, 9.0f);
        uf.r(b, 1.15f, 3.65f, -2.3f);
        b.moveTo(22.0f, 7.0f);
        b.lineToRelative(-1.2f, 6.29f);
        b.lineTo(19.3f, 7.0f);
        b.horizontalLineToRelative(-1.6f);
        b.lineToRelative(-1.49f, 6.29f);
        b.lineTo(15.0f, 7.0f);
        b.horizontalLineToRelative(-0.76f);
        b.lineToRelative(-0.01f, 0.01f);
        b.curveTo(12.76f, 5.18f, 10.53f, 4.0f, 8.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        b.curveToRelative(2.96f, 0.0f, 5.55f, -1.61f, 6.93f, -4.0f);
        b.curveToRelative(0.03f, -0.06f, 0.05f, -0.12f, 0.08f, -0.18f);
        b.curveToRelative(0.05f, -0.08f, 0.09f, -0.17f, 0.14f, -0.25f);
        b.lineToRelative(0.1f, 0.43f);
        b.lineTo(17.0f, 16.0f);
        b.lineToRelative(1.5f, -6.1f);
        b.lineTo(20.0f, 16.0f);
        b.horizontalLineToRelative(1.75f);
        gy.B(b, 2.05f, -9.0f, 22.0f, 7.0f);
        b.moveTo(13.37f, 14.67f);
        b.curveTo(12.38f, 16.64f, 10.35f, 18.0f, 8.0f, 18.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        b.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        b.curveToRelative(0.0f, 0.96f, -0.23f, 1.86f, -0.63f, 2.67f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbAuto = build;
        build.getClass();
        return build;
    }
}
