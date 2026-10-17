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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LooksKt {
    private static ImageVector _looks;

    public static final ImageVector getLooks(Icons.Rounded rounded) {
        ImageVector imageVector = _looks;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Looks", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 10.0f);
        b.curveToRelative(-3.47f, 0.0f, -6.36f, 2.54f, -6.91f, 5.86f);
        b.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        b.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        b.curveTo(7.48f, 13.79f, 9.53f, 12.0f, 12.0f, 12.0f);
        b.reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f);
        b.curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f);
        b.curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 0.99f, -1.14f);
        b.curveTo(18.36f, 12.54f, 15.47f, 10.0f, 12.0f, 10.0f);
        b.close();
        b.moveTo(12.0f, 6.0f);
        b.curveTo(6.3f, 6.0f, 1.61f, 10.34f, 1.05f, 15.9f);
        b.curveToRelative(-0.05f, 0.59f, 0.41f, 1.1f, 1.01f, 1.1f);
        b.curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f);
        b.curveTo(3.49f, 11.57f, 7.34f, 8.0f, 12.0f, 8.0f);
        b.reflectiveCurveToRelative(8.51f, 3.57f, 8.96f, 8.12f);
        b.curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f);
        b.curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f);
        b.curveTo(22.39f, 10.34f, 17.7f, 6.0f, 12.0f, 6.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _looks = build;
        build.getClass();
        return build;
    }
}
