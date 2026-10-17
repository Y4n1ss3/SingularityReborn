package androidx.compose.material.icons.outlined;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HexagonKt {
    private static ImageVector _hexagon;

    public static final ImageVector getHexagon(Icons.Outlined outlined) {
        ImageVector imageVector = _hexagon;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Hexagon", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(17.2f, 3.0f, 6.8f, -5.2f, 9.0f);
        a.lineToRelative(5.2f, 9.0f);
        a.horizontalLineToRelative(10.4f);
        gy.B(a, 5.2f, -9.0f, 17.2f, 3.0f);
        a.moveTo(16.05f, 19.0f);
        a.horizontalLineTo(7.95f);
        a.lineToRelative(-4.04f, -7.0f);
        a.lineToRelative(4.04f, -7.0f);
        a.horizontalLineToRelative(8.09f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(a, 4.04f, 7.0f, 16.05f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hexagon = build;
        build.getClass();
        return build;
    }
}
