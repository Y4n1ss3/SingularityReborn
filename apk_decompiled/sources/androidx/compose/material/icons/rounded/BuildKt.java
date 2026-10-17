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
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.Rounded rounded) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Build", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.09f, 2.91f);
        b.curveTo(10.08f, 0.9f, 7.07f, 0.49f, 4.65f, 1.67f);
        b.lineTo(8.28f, 5.3f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(6.69f, 8.3f);
        b.curveToRelative(-0.39f, 0.4f, -1.02f, 0.4f, -1.41f, 0.0f);
        b.lineTo(1.65f, 4.67f);
        b.curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f);
        b.curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f);
        b.lineToRelative(7.96f, 7.96f);
        b.curveToRelative(1.03f, 1.03f, 2.69f, 1.03f, 3.71f, 0.0f);
        b.curveToRelative(1.03f, -1.03f, 1.03f, -2.69f, 0.0f, -3.71f);
        b.lineTo(13.54f, 9.9f);
        b.curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = build;
        build.getClass();
        return build;
    }
}
