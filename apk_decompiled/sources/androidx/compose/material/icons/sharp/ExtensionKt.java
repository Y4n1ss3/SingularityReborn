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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExtensionKt {
    private static ImageVector _extension;

    public static final ImageVector getExtension(Icons.Sharp sharp) {
        ImageVector imageVector = _extension;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Extension", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(20.36f, 11.0f, 19.0f, 5.0f, -6.0f);
        f.verticalLineTo(3.64f);
        f.curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f);
        f.curveTo(9.26f, 0.86f, 8.0f, 2.03f, 8.0f, 3.5f);
        f.verticalLineTo(5.0f);
        f.horizontalLineTo(2.01f);
        f.verticalLineToRelative(5.8f);
        f.horizontalLineTo(3.4f);
        f.curveToRelative(1.31f, 0.0f, 2.5f, 0.88f, 2.75f, 2.16f);
        f.curveToRelative(0.33f, 1.72f, -0.98f, 3.24f, -2.65f, 3.24f);
        kf0.o(f, 2.0f, 22.0f, 5.8f, -1.4f);
        f.curveToRelative(0.0f, -1.31f, 0.88f, -2.5f, 2.16f, -2.75f);
        f.curveToRelative(1.72f, -0.33f, 3.24f, 0.98f, 3.24f, 2.65f);
        bv.A(f, 22.0f, 19.0f, -6.0f, 1.5f);
        f.curveToRelative(1.47f, 0.0f, 2.64f, -1.26f, 2.49f, -2.76f);
        f.curveToRelative(-0.13f, -1.3f, -1.33f, -2.24f, -2.63f, -2.24f);
        f.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, f.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extension = build;
        build.getClass();
        return build;
    }
}
