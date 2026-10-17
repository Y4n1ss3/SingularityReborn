package androidx.compose.material.icons.twotone;

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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CallKt {
    private static ImageVector _call;

    public static final ImageVector getCall(Icons.TwoTone twoTone) {
        ImageVector imageVector = _call;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Call", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 17.47f);
        b.curveToRelative(-0.88f, -0.07f, -1.75f, -0.22f, -2.6f, -0.45f);
        b.lineToRelative(-1.19f, 1.19f);
        b.curveToRelative(1.2f, 0.41f, 2.48f, 0.67f, 3.8f, 0.75f);
        bv.m(b, -1.49f, 6.54f, 5.0f, -1.5f);
        b.curveToRelative(0.09f, 1.32f, 0.35f, 2.59f, 0.75f, 3.8f);
        b.lineToRelative(1.2f, -1.2f);
        b.curveToRelative(-0.24f, -0.84f, -0.39f, -1.71f, -0.45f, -2.6f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(20.0f, 21.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b2.verticalLineToRelative(-3.49f);
        b2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b2.curveToRelative(-1.24f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        b2.curveToRelative(-0.1f, -0.04f, -0.21f, -0.05f, -0.31f, -0.05f);
        b2.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        b2.lineToRelative(-2.2f, 2.2f);
        b2.curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f);
        b2.lineToRelative(2.2f, -2.2f);
        b2.curveToRelative(0.28f, -0.28f, 0.36f, -0.67f, 0.25f, -1.02f);
        b2.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        b2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b2.lineTo(4.0f, 3.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b2.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        b2.close();
        b2.moveTo(16.4f, 17.02f);
        b2.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        b2.verticalLineToRelative(1.49f);
        b2.curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f);
        fc.B(b2, 1.2f, -1.19f, 5.03f, 5.0f);
        b2.horizontalLineToRelative(1.5f);
        b2.curveToRelative(0.07f, 0.89f, 0.22f, 1.76f, 0.46f, 2.59f);
        b2.lineToRelative(-1.2f, 1.2f);
        b2.curveToRelative(-0.41f, -1.2f, -0.67f, -2.47f, -0.76f, -3.79f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _call = build;
        build.getClass();
        return build;
    }
}
