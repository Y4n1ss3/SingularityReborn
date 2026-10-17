package androidx.compose.material.icons.sharp;

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
public final class HeadsetKt {
    private static ImageVector _headset;

    public static final ImageVector getHeadset(Icons.Sharp sharp) {
        ImageVector imageVector = _headset;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Headset", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.4f, 1.02f);
        b.curveTo(6.62f, 1.33f, 3.0f, 5.52f, 3.0f, 10.31f);
        j50.B(b, 20.0f, 6.0f, -8.0f, 5.0f);
        b.verticalLineToRelative(-1.71f);
        b.curveTo(5.0f, 6.45f, 7.96f, 3.11f, 11.79f, 3.0f);
        b.curveTo(15.76f, 2.89f, 19.0f, 6.06f, 19.0f, 10.0f);
        r6.D(b, 2.0f, -4.0f, 8.0f, 6.0f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -5.17f, -4.36f, -9.32f, -9.6f, -8.98f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _headset = build;
        build.getClass();
        return build;
    }
}
