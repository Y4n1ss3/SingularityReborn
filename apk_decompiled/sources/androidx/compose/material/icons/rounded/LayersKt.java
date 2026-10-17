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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayersKt {
    private static ImageVector _layers;

    public static final ImageVector getLayers(Icons.Rounded rounded) {
        ImageVector imageVector = _layers;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Layers", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.6f, 18.06f);
        b.curveToRelative(-0.36f, 0.28f, -0.87f, 0.28f, -1.23f, 0.0f);
        b.lineToRelative(-6.15f, -4.78f);
        b.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        b.curveToRelative(-0.51f, 0.4f, -0.51f, 1.17f, 0.0f, 1.57f);
        b.lineToRelative(6.76f, 5.26f);
        b.curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0.0f);
        b.lineToRelative(6.76f, -5.26f);
        b.curveToRelative(0.51f, -0.4f, 0.51f, -1.17f, 0.0f, -1.57f);
        b.lineToRelative(-0.01f, -0.01f);
        b.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        fc.B(b, -6.15f, 4.79f, 13.23f, 15.04f);
        b.lineToRelative(6.76f, -5.26f);
        b.curveToRelative(0.51f, -0.4f, 0.51f, -1.18f, 0.0f, -1.58f);
        b.lineToRelative(-6.76f, -5.26f);
        b.curveToRelative(-0.72f, -0.56f, -1.73f, -0.56f, -2.46f, 0.0f);
        b.lineTo(4.01f, 8.21f);
        b.curveToRelative(-0.51f, 0.4f, -0.51f, 1.18f, 0.0f, 1.58f);
        b.lineToRelative(6.76f, 5.26f);
        b.curveToRelative(0.72f, 0.56f, 1.74f, 0.56f, 2.46f, -0.01f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layers = build;
        build.getClass();
        return build;
    }
}
