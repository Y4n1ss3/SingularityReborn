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
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbAutoKt {
    private static ImageVector _wbAuto;

    public static final ImageVector getWbAuto(Icons.Filled filled) {
        ImageVector imageVector = _wbAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WbAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(6.85f, 12.65f, 2.3f, 8.0f, 9.0f);
        fc.B(p, -1.15f, 3.65f, 22.0f, 7.0f);
        p.lineToRelative(-1.2f, 6.29f);
        p.lineTo(19.3f, 7.0f);
        p.horizontalLineToRelative(-1.6f);
        p.lineToRelative(-1.49f, 6.29f);
        p.lineTo(15.0f, 7.0f);
        p.horizontalLineToRelative(-0.76f);
        p.curveTo(12.77f, 5.17f, 10.53f, 4.0f, 8.0f, 4.0f);
        p.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        p.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        p.curveToRelative(3.13f, 0.0f, 5.84f, -1.81f, 7.15f, -4.43f);
        p.lineToRelative(0.1f, 0.43f);
        p.lineTo(17.0f, 16.0f);
        p.lineToRelative(1.5f, -6.1f);
        p.lineTo(20.0f, 16.0f);
        p.horizontalLineToRelative(1.75f);
        gy.B(p, 2.05f, -9.0f, 22.0f, 7.0f);
        p.moveTo(10.3f, 16.0f);
        p.lineToRelative(-0.7f, -2.0f);
        p.lineTo(6.4f, 14.0f);
        p.lineToRelative(-0.7f, 2.0f);
        p.lineTo(3.8f, 16.0f);
        p.lineTo(7.0f, 7.0f);
        p.horizontalLineToRelative(2.0f);
        p.lineToRelative(3.2f, 9.0f);
        p.horizontalLineToRelative(-1.9f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbAuto = build;
        build.getClass();
        return build;
    }
}
