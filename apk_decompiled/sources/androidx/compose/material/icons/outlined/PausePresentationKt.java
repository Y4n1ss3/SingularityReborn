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
import defpackage.af0;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PausePresentationKt {
    private static ImageVector _pausePresentation;

    public static final ImageVector getPausePresentation(Icons.Outlined outlined) {
        ImageVector imageVector = _pausePresentation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PausePresentation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 3.0f, 3.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.85f, -2.0f, 1.95f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.05f, 2.0f, 2.05f);
        i.horizontalLineToRelative(18.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.95f, 2.0f, -2.05f);
        i.verticalLineToRelative(-14.0f);
        i.curveTo(23.0f, 3.85f, 22.1f, 3.0f, 21.0f, 3.0f);
        k4.r(i, 21.0f, 19.0f, 3.0f, 19.0f);
        r6.m(i, 3.0f, 5.0f, 18.0f, 14.0f);
        k4.C(i, 9.0f, 8.0f, 2.0f, 8.0f);
        uo.l(i, 9.0f, 16.0f, 13.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.v(i, 2.0f, 8.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pausePresentation = build;
        build.getClass();
        return build;
    }
}
