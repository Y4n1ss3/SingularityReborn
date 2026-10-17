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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScienceKt {
    private static ImageVector _science;

    public static final ImageVector getScience(Icons.Sharp sharp) {
        ImageVector imageVector = _science;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Science", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(19.8f, 18.4f, 14.0f, 10.67f, 6.5f);
        u.lineToRelative(1.35f, -1.69f);
        u.curveTo(15.61f, 4.48f, 15.38f, 4.0f, 14.96f, 4.0f);
        u.horizontalLineTo(9.04f);
        u.curveTo(8.62f, 4.0f, 8.39f, 4.48f, 8.65f, 4.81f);
        u.lineTo(10.0f, 6.5f);
        u.verticalLineToRelative(4.17f);
        u.lineTo(4.2f, 18.4f);
        u.curveTo(3.71f, 19.06f, 4.18f, 20.0f, 5.0f, 20.0f);
        u.horizontalLineToRelative(14.0f);
        u.curveTo(19.82f, 20.0f, 20.29f, 19.06f, 19.8f, 18.4f);
        u.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, u.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _science = build;
        build.getClass();
        return build;
    }
}
