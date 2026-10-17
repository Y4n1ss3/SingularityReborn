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
public final class VrpanoKt {
    private static ImageVector _vrpano;

    public static final ImageVector getVrpano(Icons.Rounded rounded) {
        ImageVector imageVector = _vrpano;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Vrpano", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.69f, 4.05f);
        b.curveTo(18.66f, 4.73f, 15.86f, 5.5f, 12.0f, 5.5f);
        b.curveToRelative(-3.89f, 0.0f, -6.95f, -0.84f, -8.69f, -1.43f);
        b.curveTo(2.67f, 3.85f, 2.0f, 4.33f, 2.0f, 5.02f);
        b.verticalLineTo(19.0f);
        b.curveToRelative(0.0f, 0.68f, 0.66f, 1.17f, 1.31f, 0.95f);
        b.curveTo(5.36f, 19.26f, 8.1f, 18.5f, 12.0f, 18.5f);
        b.curveToRelative(3.87f, 0.0f, 6.66f, 0.76f, 8.69f, 1.45f);
        b.curveTo(21.34f, 20.16f, 22.0f, 19.68f, 22.0f, 19.0f);
        b.verticalLineTo(5.0f);
        b.curveTo(22.0f, 4.32f, 21.34f, 3.84f, 20.69f, 4.05f);
        b.close();
        b.moveTo(17.28f, 15.26f);
        b.curveTo(15.62f, 15.1f, 13.84f, 15.0f, 12.0f, 15.0f);
        b.curveToRelative(-1.87f, 0.0f, -3.63f, 0.1f, -5.28f, 0.27f);
        b.curveTo(6.27f, 15.31f, 6.0f, 14.79f, 6.29f, 14.45f);
        b.lineToRelative(2.5f, -3.0f);
        b.curveToRelative(0.2f, -0.24f, 0.57f, -0.24f, 0.77f, 0.0f);
        b.lineToRelative(1.62f, 1.94f);
        b.lineToRelative(2.44f, -2.93f);
        b.curveToRelative(0.2f, -0.24f, 0.57f, -0.24f, 0.77f, 0.0f);
        b.lineToRelative(3.32f, 3.99f);
        b.curveTo(17.99f, 14.79f, 17.72f, 15.31f, 17.28f, 15.26f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vrpano = build;
        build.getClass();
        return build;
    }
}
