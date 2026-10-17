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
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkEmailReadKt {
    private static ImageVector _markEmailRead;

    public static final ImageVector getMarkEmailRead(Icons.Rounded rounded) {
        ImageVector imageVector = _markEmailRead;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MarkEmailRead", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.05f, 21.29f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.lineToRelative(-2.12f, -2.12f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(1.41f, 1.41f);
        b.lineToRelative(3.54f, -3.54f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        uo.l(b, 18.05f, 21.29f, 12.08f, 20.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.verticalLineToRelative(6.68f);
        b.curveTo(21.09f, 12.25f, 20.08f, 12.0f, 19.0f, 12.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        b.curveTo(12.0f, 19.34f, 12.03f, 19.67f, 12.08f, 20.0f);
        b.close();
        b.moveTo(11.47f, 12.67f);
        b.curveToRelative(0.32f, 0.2f, 0.74f, 0.2f, 1.06f, 0.0f);
        b.lineToRelative(7.07f, -4.42f);
        b.curveTo(19.85f, 8.09f, 20.0f, 7.82f, 20.0f, 7.53f);
        b.curveToRelative(0.0f, -0.67f, -0.73f, -1.07f, -1.3f, -0.72f);
        b.lineTo(12.0f, 11.0f);
        b.lineTo(5.3f, 6.81f);
        b.curveTo(4.73f, 6.46f, 4.0f, 6.86f, 4.0f, 7.53f);
        b.curveToRelative(0.0f, 0.29f, 0.15f, 0.56f, 0.4f, 0.72f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 11.47f, 12.67f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markEmailRead = build;
        build.getClass();
        return build;
    }
}
