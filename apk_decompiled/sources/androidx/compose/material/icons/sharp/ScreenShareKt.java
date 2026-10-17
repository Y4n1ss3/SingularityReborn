package androidx.compose.material.icons.sharp;

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
import defpackage.er;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenShareKt {
    private static ImageVector _screenShare;

    public static final ImageVector getScreenShare(Icons.Sharp sharp) {
        ImageVector imageVector = _screenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.0f, 18.0f, 2.0f, -2.0f);
        e.lineTo(22.0f, 4.0f);
        e.lineTo(2.0f, 4.0f);
        e.verticalLineToRelative(12.0f);
        e.lineToRelative(2.0f, 2.0f);
        af0.m(e, 0.0f, 18.0f, 2.0f, 24.0f);
        kf0.C(e, -2.0f, -4.0f, 13.0f, 14.47f);
        e.verticalLineToRelative(-2.19f);
        e.curveToRelative(-2.78f, 0.0f, -4.61f, 0.85f, -6.0f, 2.72f);
        e.curveToRelative(0.56f, -2.67f, 2.11f, -5.33f, 6.0f, -5.87f);
        e.lineTo(13.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 4.0f, 3.73f, -4.0f, 3.74f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenShare = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getScreenShare$annotations(Icons.Sharp sharp) {
    }
}
