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
import defpackage.er;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LiveHelpKt {
    private static ImageVector _liveHelp;

    public static final ImageVector getLiveHelp(Icons.Outlined outlined) {
        ImageVector imageVector = _liveHelp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LiveHelp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 2.0f, 5.0f, 2.0f);
        i.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(4.0f);
        i.lineToRelative(3.0f, 3.0f);
        i.lineToRelative(3.0f, -3.0f);
        i.horizontalLineToRelative(4.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.l(i, 19.0f, 18.0f, -4.83f);
        i.lineToRelative(-0.59f, 0.59f);
        i.lineTo(12.0f, 20.17f);
        i.lineToRelative(-1.59f, -1.59f);
        i.lineToRelative(-0.58f, -0.58f);
        i.lineTo(5.0f, 18.0f);
        r6.m(i, 5.0f, 4.0f, 14.0f, 14.0f);
        k4.C(i, 11.0f, 15.0f, 2.0f, 2.0f);
        j50.t(i, -2.0f, 12.0f, 7.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        i.curveToRelative(0.0f, 2.0f, -3.0f, 1.75f, -3.0f, 5.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.0f, -2.25f, 3.0f, -2.5f, 3.0f, -5.0f);
        i.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        i.reflectiveCurveTo(8.0f, 6.79f, 8.0f, 9.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _liveHelp = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getLiveHelp$annotations(Icons.Outlined outlined) {
    }
}
