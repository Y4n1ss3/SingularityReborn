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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayersClearKt {
    private static ImageVector _layersClear;

    public static final ImageVector getLayersClear(Icons.Rounded rounded) {
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LayersClear", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.99f, 9.79f);
        b.curveToRelative(0.51f, -0.4f, 0.51f, -1.18f, 0.0f, -1.58f);
        b.lineToRelative(-6.76f, -5.26f);
        b.curveToRelative(-0.72f, -0.56f, -1.73f, -0.56f, -2.46f, 0.0f);
        b.lineTo(9.41f, 4.02f);
        fc.C(b, 7.88f, 7.88f, 2.7f, -2.11f);
        b.moveTo(19.99f, 13.28f);
        b.lineToRelative(-0.01f, -0.01f);
        b.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        b.lineToRelative(-0.05f, 0.04f);
        b.lineToRelative(1.4f, 1.4f);
        b.curveToRelative(0.37f, -0.41f, 0.34f, -1.07f, -0.12f, -1.43f);
        k4.r(b, 21.44f, 18.88f, 4.12f, 1.56f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(3.52f, 3.52f);
        b.lineToRelative(-2.22f, 1.72f);
        b.curveToRelative(-0.51f, 0.4f, -0.51f, 1.18f, 0.0f, 1.58f);
        b.lineToRelative(6.76f, 5.26f);
        b.curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0.0f);
        b.lineToRelative(0.87f, -0.68f);
        b.lineToRelative(1.42f, 1.42f);
        b.lineToRelative(-2.92f, 2.27f);
        b.curveToRelative(-0.36f, 0.28f, -0.87f, 0.28f, -1.23f, 0.0f);
        b.lineToRelative(-6.15f, -4.78f);
        b.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        b.curveToRelative(-0.51f, 0.4f, -0.51f, 1.17f, 0.0f, 1.57f);
        b.lineToRelative(6.76f, 5.26f);
        b.curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0.0f);
        b.lineToRelative(3.72f, -2.89f);
        b.lineToRelative(3.07f, 3.07f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.41f, -0.39f, 0.41f, -1.02f, 0.02f, -1.41f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = build;
        build.getClass();
        return build;
    }
}
