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
public final class EcoKt {
    private static ImageVector _eco;

    public static final ImageVector getEco(Icons.Rounded rounded) {
        ImageVector imageVector = _eco;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Eco", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.95f, 5.97f);
        b.curveToRelative(-0.05f, -1.04f, -0.89f, -1.88f, -1.92f, -1.92f);
        b.curveTo(17.33f, 4.02f, 16.66f, 4.0f, 16.01f, 4.0f);
        b.curveTo(10.98f, 4.0f, 7.49f, 4.97f, 5.55f, 6.91f);
        b.curveToRelative(-3.68f, 3.68f, -3.15f, 8.9f, 0.09f, 11.9f);
        b.curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, 0.0f);
        b.curveToRelative(1.51f, -4.22f, 4.52f, -7.16f, 7.67f, -8.8f);
        b.curveToRelative(-0.21f, 0.18f, -4.7f, 3.58f, -5.51f, 10.25f);
        b.curveToRelative(1.05f, 0.48f, 2.2f, 0.75f, 3.36f, 0.75f);
        b.curveToRelative(2.05f, 0.0f, 4.16f, -0.8f, 5.92f, -2.55f);
        b.curveTo(19.28f, 16.26f, 20.23f, 12.1f, 19.95f, 5.97f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eco = build;
        build.getClass();
        return build;
    }
}
