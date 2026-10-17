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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TwoWheelerKt {
    private static ImageVector _twoWheeler;

    public static final ImageVector getTwoWheeler(Icons.Filled filled) {
        ImageVector imageVector = _twoWheeler;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TwoWheeler", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 11.0f);
        b.curveToRelative(-0.18f, 0.0f, -0.36f, 0.03f, -0.53f, 0.05f);
        fc.v(b, 17.41f, 9.0f, 20.0f, 6.0f);
        b.lineToRelative(-3.72f, 1.86f);
        r6.w(b, 13.41f, 5.0f, 9.0f, 2.0f);
        r6.t(b, 3.59f, 2.0f, 2.0f, 11.0f);
        b.lineToRelative(-4.0f, 2.0f);
        r6.w(b, 5.0f, 9.0f, 0.0f, 2.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.lineToRelative(2.0f, 2.0f);
        b.horizontalLineToRelative(3.0f);
        b.lineToRelative(3.49f, -6.1f);
        b.lineToRelative(1.01f, 1.01f);
        b.curveTo(16.59f, 12.64f, 16.0f, 13.75f, 16.0f, 15.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.curveTo(24.0f, 12.79f, 22.21f, 11.0f, 20.0f, 11.0f);
        b.close();
        b.moveTo(4.0f, 17.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.curveTo(6.0f, 16.1f, 5.1f, 17.0f, 4.0f, 17.0f);
        b.close();
        b.moveTo(20.0f, 17.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.curveTo(22.0f, 16.1f, 21.1f, 17.0f, 20.0f, 17.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _twoWheeler = build;
        build.getClass();
        return build;
    }
}
