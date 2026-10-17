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
import defpackage.er;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigateNextKt {
    private static ImageVector _navigateNext;

    public static final ImageVector getNavigateNext(Icons.TwoTone twoTone) {
        ImageVector imageVector = _navigateNext;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NavigateNext", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.02f, 18.0f, 6.0f, -6.0f);
        e.lineToRelative(-6.0f, -6.0f);
        e.lineToRelative(-1.41f, 1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(e, 13.19f, 12.0f, -4.58f, 4.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _navigateNext = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getNavigateNext$annotations(Icons.TwoTone twoTone) {
    }
}
