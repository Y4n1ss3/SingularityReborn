package androidx.compose.material.icons.rounded;

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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CardTravelKt {
    private static ImageVector _cardTravel;

    public static final ImageVector getCardTravel(Icons.Rounded rounded) {
        ImageVector imageVector = _cardTravel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CardTravel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 6.0f, -3.0f, 17.0f, 4.0f);
        p.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        p.lineTo(9.0f, 2.0f);
        p.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        p.verticalLineToRelative(2.0f);
        p.lineTo(4.0f, 6.0f);
        p.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        p.verticalLineToRelative(11.0f);
        p.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(16.0f);
        p.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        p.lineTo(22.0f, 8.0f);
        p.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        r6.B(p, 9.0f, 4.0f, 6.0f, 2.0f);
        r6.C(p, 9.0f, 6.0f, 9.0f, 4.0f);
        p.moveTo(20.0f, 19.0f);
        af0.m(p, 4.0f, 19.0f, -2.0f, 16.0f);
        r6.l(p, 2.0f, 20.0f, 14.0f);
        p.lineTo(4.0f, 14.0f);
        p.lineTo(4.0f, 9.0f);
        p.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        p.horizontalLineToRelative(2.0f);
        p.verticalLineToRelative(1.0f);
        p.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        p.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        fc.w(p, 9.0f, 8.0f, 6.0f, 1.0f);
        p.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        p.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        p.lineTo(17.0f, 8.0f);
        p.horizontalLineToRelative(2.0f);
        p.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cardTravel = build;
        build.getClass();
        return build;
    }
}
