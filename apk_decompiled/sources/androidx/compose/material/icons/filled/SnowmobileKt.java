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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnowmobileKt {
    private static ImageVector _snowmobile;

    public static final ImageVector getSnowmobile(Icons.Filled filled) {
        ImageVector imageVector = _snowmobile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Snowmobile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 17.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-0.17f);
        b.lineToRelative(-2.2f, -2.2f);
        b.curveTo(20.58f, 15.37f, 22.0f, 14.4f, 22.0f, 13.0f);
        b.curveToRelative(0.0f, -1.0f, -8.0f, -8.0f, -8.0f, -8.0f);
        kf0.x(b, -3.0f, 2.0f, 2.25f);
        b.lineToRelative(1.45f, 1.3f);
        b.lineTo(11.0f, 11.0f);
        b.lineToRelative(-9.5f, -1.0f);
        b.lineTo(0.0f, 13.0f);
        b.lineToRelative(4.54f, 1.36f);
        b.lineToRelative(-3.49f, 1.88f);
        b.curveTo(-0.77f, 17.22f, -0.07f, 20.0f, 2.0f, 20.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        kf0.B(b, 4.0f, 2.0f, 2.0f, -3.0f);
        b.verticalLineToRelative(2.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        kp0.B(b, 22.0f, 8.0f, 18.0f, 2.0f);
        b.lineToRelative(5.25f, -2.83f);
        b.lineTo(10.0f, 16.0f);
        b.curveTo(10.0f, 17.1f, 9.11f, 18.0f, 8.0f, 18.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowmobile = build;
        build.getClass();
        return build;
    }
}
