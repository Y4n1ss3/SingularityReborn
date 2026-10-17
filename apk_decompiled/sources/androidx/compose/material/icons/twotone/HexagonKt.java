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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HexagonKt {
    private static ImageVector _hexagon;

    public static final ImageVector getHexagon(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hexagon;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Hexagon", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.05f, 19.0f, -8.1f, 0.0f);
        e.lineToRelative(-4.04f, -7.0f);
        e.lineToRelative(4.04f, -7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 8.1f, 0.0f, 4.04f, 7.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(17.2f, 3.0f, 6.8f, -5.2f, 9.0f);
        a.lineToRelative(5.2f, 9.0f);
        a.horizontalLineToRelative(10.4f);
        gy.B(a, 5.2f, -9.0f, 17.2f, 3.0f);
        a.moveTo(16.05f, 19.0f);
        a.horizontalLineTo(7.95f);
        a.lineToRelative(-4.04f, -7.0f);
        a.lineToRelative(4.04f, -7.0f);
        a.horizontalLineToRelative(8.09f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(a, 4.04f, 7.0f, 16.05f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hexagon = build;
        build.getClass();
        return build;
    }
}
