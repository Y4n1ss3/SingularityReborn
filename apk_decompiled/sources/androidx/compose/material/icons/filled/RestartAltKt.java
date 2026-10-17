package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RestartAltKt {
    private static ImageVector _restartAlt;

    public static final ImageVector getRestartAlt(Icons.Filled filled) {
        ImageVector imageVector = _restartAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RestartAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = af0.j(12.0f, 5.0f, 2.0f, 8.0f, 6.0f);
        j.lineToRelative(4.0f, 4.0f);
        j.verticalLineTo(7.0f);
        j.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        j.curveToRelative(0.0f, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
        j.verticalLineToRelative(2.02f);
        j.curveToRelative(3.95f, -0.49f, 7.0f, -3.85f, 7.0f, -7.93f);
        j.curveTo(20.0f, 8.58f, 16.42f, 5.0f, 12.0f, 5.0f);
        j.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 13.0f);
        b.curveToRelative(0.0f, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f);
        b.lineTo(6.34f, 7.34f);
        b.curveTo(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f);
        b.curveToRelative(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
        b.verticalLineToRelative(-2.02f);
        b.curveTo(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restartAlt = build;
        build.getClass();
        return build;
    }
}
