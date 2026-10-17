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
public final class MovingKt {
    private static ImageVector _moving;

    public static final ImageVector getMoving(Icons.Rounded rounded) {
        ImageVector imageVector = _moving;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Moving", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(2.7f, 17.29f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(4.59f, -4.59f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(1.17f, 1.17f);
        b.curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f);
        b.lineToRelative(4.18f, -4.17f);
        b.lineToRelative(1.44f, 1.44f);
        b.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
        b.verticalLineTo(6.5f);
        b.curveTo(22.0f, 6.22f, 21.78f, 6.0f, 21.5f, 6.0f);
        b.horizontalLineToRelative(-4.29f);
        b.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        b.lineToRelative(1.44f, 1.44f);
        b.lineToRelative(-4.17f, 4.17f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.lineToRelative(-1.17f, -1.17f);
        b.curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        b.lineTo(2.7f, 15.88f);
        b.curveTo(2.32f, 16.27f, 2.32f, 16.91f, 2.7f, 17.29f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moving = build;
        build.getClass();
        return build;
    }
}
