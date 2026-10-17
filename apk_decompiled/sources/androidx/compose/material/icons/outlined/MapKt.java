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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.Outlined outlined) {
        ImageVector imageVector = _map;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Map", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.5f, 3.0f, -0.16f, 0.03f);
        e.lineTo(15.0f, 5.1f);
        e.lineTo(9.0f, 3.0f);
        e.lineTo(3.36f, 4.9f);
        e.curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        e.lineTo(3.0f, 20.5f);
        e.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        e.lineToRelative(0.16f, -0.03f);
        e.lineTo(9.0f, 18.9f);
        e.lineToRelative(6.0f, 2.1f);
        e.lineToRelative(5.64f, -1.9f);
        e.curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        e.lineTo(21.0f, 3.5f);
        e.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        k4.x(e, 10.0f, 5.47f, 4.0f, 1.4f);
        e.verticalLineToRelative(11.66f);
        gy.B(e, -4.0f, -1.4f, 10.0f, 5.47f);
        e.moveTo(5.0f, 6.46f);
        e.lineToRelative(3.0f, -1.01f);
        e.verticalLineToRelative(11.7f);
        gy.B(e, -3.0f, 1.16f, 5.0f, 6.46f);
        e.moveTo(19.0f, 17.54f);
        e.lineToRelative(-3.0f, 1.01f);
        e.lineTo(16.0f, 6.86f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.n(e, 3.0f, -1.16f, 11.84f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = build;
        build.getClass();
        return build;
    }
}
