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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VrpanoKt {
    private static ImageVector _vrpano;

    public static final ImageVector getVrpano(Icons.Sharp sharp) {
        ImageVector imageVector = _vrpano;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Vrpano", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 5.5f);
        b.curveToRelative(-5.25f, 0.0f, -9.01f, -1.54f, -10.0f, -1.92f);
        b.verticalLineTo(20.4f);
        b.curveToRelative(2.16f, -0.76f, 5.21f, -1.9f, 10.0f, -1.9f);
        b.curveToRelative(4.78f, 0.0f, 7.91f, 1.17f, 10.0f, 1.9f);
        b.verticalLineTo(3.6f);
        b.curveTo(19.91f, 4.33f, 16.77f, 5.5f, 12.0f, 5.5f);
        b.close();
        b.moveTo(12.0f, 15.0f);
        b.curveToRelative(-2.34f, 0.0f, -4.52f, 0.15f, -6.52f, 0.41f);
        b.lineToRelative(3.69f, -4.42f);
        b.lineToRelative(2.0f, 2.4f);
        b.lineTo(14.0f, 10.0f);
        b.lineToRelative(4.51f, 5.4f);
        b.curveTo(16.52f, 15.15f, 14.3f, 15.0f, 12.0f, 15.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vrpano = build;
        build.getClass();
        return build;
    }
}
