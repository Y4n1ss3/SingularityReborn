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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReplayKt {
    private static ImageVector _replay;

    public static final ImageVector getReplay(Icons.Sharp sharp) {
        ImageVector imageVector = _replay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Replay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = af0.j(12.0f, 5.0f, 1.0f, 7.0f, 6.0f);
        j.lineToRelative(5.0f, 5.0f);
        j.verticalLineTo(7.0f);
        j.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        j.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        j.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        j.horizontalLineTo(4.0f);
        j.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        j.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(j, 16.42f, 5.0f, 12.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replay = build;
        build.getClass();
        return build;
    }
}
