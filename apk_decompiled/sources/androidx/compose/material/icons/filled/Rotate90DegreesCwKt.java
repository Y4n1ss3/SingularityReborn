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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Rotate90DegreesCwKt {
    private static ImageVector _rotate90DegreesCw;

    public static final ImageVector getRotate90DegreesCw(Icons.Filled filled) {
        ImageVector imageVector = _rotate90DegreesCw;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Rotate90DegreesCw", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.64f, 19.37f);
        b.curveToRelative(3.03f, 3.03f, 7.67f, 3.44f, 11.15f, 1.25f);
        b.lineToRelative(-1.46f, -1.46f);
        b.curveToRelative(-2.66f, 1.43f, -6.04f, 1.03f, -8.28f, -1.21f);
        b.curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0.0f, -9.9f);
        b.curveTo(7.42f, 6.69f, 9.21f, 6.03f, 11.0f, 6.03f);
        b.verticalLineTo(9.0f);
        b.lineToRelative(4.0f, -4.0f);
        b.lineToRelative(-4.0f, -4.0f);
        b.verticalLineToRelative(3.01f);
        b.curveToRelative(-2.3f, 0.0f, -4.61f, 0.87f, -6.36f, 2.63f);
        b.curveTo(1.12f, 10.15f, 1.12f, 15.85f, 4.64f, 19.37f);
        k4.x(b, 11.0f, 13.0f, 6.0f, 6.0f);
        b.lineToRelative(6.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, -6.0f, -6.0f, 11.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCw = build;
        build.getClass();
        return build;
    }
}
