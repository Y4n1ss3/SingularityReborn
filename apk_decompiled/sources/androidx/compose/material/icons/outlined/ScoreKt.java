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
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScoreKt {
    private static ImageVector _score;

    public static final ImageVector getScore(Icons.Outlined outlined) {
        ImageVector imageVector = _score;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Score", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 19.0f, 19.0f, 5.0f, 19.0f);
        i.lineToRelative(4.0f, -4.0f);
        i.lineToRelative(4.0f, 4.0f);
        uf.v(i, 6.0f, -6.0f, 6.0f);
        i.moveTo(19.0f, 10.5f);
        i.lineToRelative(-6.0f, 6.0f);
        i.lineToRelative(-4.0f, -4.0f);
        i.lineToRelative(-4.0f, 4.0f);
        r6.m(i, 5.0f, 5.0f, 14.0f, 5.5f);
        i.moveTo(13.5f, 9.0f);
        i.lineTo(13.5f, 6.0f);
        kp0.x(i, 12.0f, 6.0f, 6.0f, 1.5f);
        i.moveTo(17.2f, 12.0f);
        i.lineToRelative(-2.0f, -3.0f);
        i.lineToRelative(2.0f, -3.0f);
        i.horizontalLineToRelative(-1.7f);
        fc.C(i, -2.0f, 3.0f, 2.0f, 3.0f);
        i.moveTo(11.0f, 10.5f);
        i.lineTo(8.5f, 10.5f);
        i.verticalLineToRelative(-0.75f);
        i.lineTo(11.0f, 9.75f);
        i.lineTo(11.0f, 6.0f);
        af0.m(i, 7.0f, 6.0f, 1.5f, 2.5f);
        i.verticalLineToRelative(0.75f);
        i.lineTo(7.0f, 8.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(i, 7.0f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _score = build;
        build.getClass();
        return build;
    }
}
