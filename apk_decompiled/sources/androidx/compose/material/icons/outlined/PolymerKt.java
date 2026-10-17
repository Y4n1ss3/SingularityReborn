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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PolymerKt {
    private static ImageVector _polymer;

    public static final ImageVector getPolymer(Icons.Outlined outlined) {
        ImageVector imageVector = _polymer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Polymer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(19.0f, 4.0f, -4.0f, 7.11f, 16.63f);
        p.lineTo(4.5f, 12.0f);
        p.lineTo(9.0f, 4.0f);
        p.horizontalLineTo(5.0f);
        p.lineTo(0.5f, 12.0f);
        p.lineTo(5.0f, 20.0f);
        p.horizontalLineToRelative(4.0f);
        p.lineToRelative(7.89f, -12.63f);
        p.lineTo(19.5f, 12.0f);
        p.lineTo(15.0f, 20.0f);
        p.horizontalLineToRelative(4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(p, 4.5f, -8.0f, 19.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _polymer = build;
        build.getClass();
        return build;
    }
}
