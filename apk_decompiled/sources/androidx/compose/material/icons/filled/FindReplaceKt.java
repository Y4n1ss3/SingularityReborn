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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FindReplaceKt {
    private static ImageVector _findReplace;

    public static final ImageVector getFindReplace(Icons.Filled filled) {
        ImageVector imageVector = _findReplace;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FindReplace", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.0f, 6.0f);
        b.curveToRelative(1.38f, 0.0f, 2.63f, 0.56f, 3.54f, 1.46f);
        b.lineTo(12.0f, 10.0f);
        b.horizontalLineToRelative(6.0f);
        b.lineTo(18.0f, 4.0f);
        b.lineToRelative(-2.05f, 2.05f);
        b.curveTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f);
        b.curveToRelative(-3.53f, 0.0f, -6.43f, 2.61f, -6.92f, 6.0f);
        b.lineTo(6.1f, 10.0f);
        b.curveToRelative(0.46f, -2.28f, 2.48f, -4.0f, 4.9f, -4.0f);
        b.close();
        b.moveTo(16.64f, 15.14f);
        b.curveToRelative(0.66f, -0.9f, 1.12f, -1.97f, 1.28f, -3.14f);
        b.lineTo(15.9f, 12.0f);
        b.curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f);
        b.curveToRelative(-1.38f, 0.0f, -2.63f, -0.56f, -3.54f, -1.46f);
        b.lineTo(10.0f, 12.0f);
        b.lineTo(4.0f, 12.0f);
        b.verticalLineToRelative(6.0f);
        b.lineToRelative(2.05f, -2.05f);
        b.curveTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f);
        b.curveToRelative(1.55f, 0.0f, 2.98f, -0.51f, 4.14f, -1.36f);
        b.lineTo(20.0f, 21.49f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(b, 21.49f, 20.0f, -4.85f, -4.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _findReplace = build;
        build.getClass();
        return build;
    }
}
