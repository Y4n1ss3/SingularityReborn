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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScoreKt {
    private static ImageVector _score;

    public static final ImageVector getScore(Icons.Sharp sharp) {
        ImageVector imageVector = _score;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Score", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(21.0f, 3.0f, 3.0f, 3.0f, 18.0f);
        gy.n(s, 18.0f, 21.0f, 3.0f);
        k4.C(s, 12.0f, 5.0f, 1.5f, 3.0f);
        s.lineToRelative(2.0f, -3.0f);
        s.horizontalLineToRelative(1.7f);
        s.lineToRelative(-2.0f, 3.0f);
        s.lineToRelative(2.0f, 3.0f);
        fc.D(s, -1.7f, -2.0f, -3.0f, 3.0f);
        r6.C(s, 12.0f, 11.0f, 12.0f, 5.0f);
        s.moveTo(7.0f, 7.25f);
        s.horizontalLineToRelative(2.5f);
        s.lineTo(9.5f, 6.5f);
        s.lineTo(7.0f, 6.5f);
        fc.w(s, 7.0f, 5.0f, 4.0f, 3.75f);
        s.lineTo(8.5f, 8.75f);
        s.verticalLineToRelative(0.75f);
        s.lineTo(11.0f, 9.5f);
        s.lineTo(11.0f, 11.0f);
        r6.C(s, 7.0f, 11.0f, 7.0f, 7.25f);
        s.moveTo(19.0f, 13.0f);
        s.lineToRelative(-6.0f, 6.0f);
        s.lineToRelative(-4.0f, -4.0f);
        s.lineToRelative(-4.0f, 4.0f);
        s.verticalLineToRelative(-2.5f);
        s.lineToRelative(4.0f, -4.0f);
        s.lineToRelative(4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(s, 6.0f, -6.0f, 19.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _score = build;
        build.getClass();
        return build;
    }
}
