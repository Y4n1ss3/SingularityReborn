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
public final class CommitKt {
    private static ImageVector _commit;

    public static final ImageVector getCommit(Icons.Sharp sharp) {
        ImageVector imageVector = _commit;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Commit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.9f, 11.0f, 16.9f, 11.0f);
        i.curveToRelative(-0.46f, -2.28f, -2.48f, -4.0f, -4.9f, -4.0f);
        i.reflectiveCurveToRelative(-4.44f, 1.72f, -4.9f, 4.0f);
        i.horizontalLineToRelative(0.0f);
        i.horizontalLineTo(2.0f);
        i.verticalLineToRelative(2.0f);
        i.horizontalLineToRelative(5.1f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.46f, 2.28f, 2.48f, 4.0f, 4.9f, 4.0f);
        i.reflectiveCurveToRelative(4.44f, -1.72f, 4.9f, -4.0f);
        i.horizontalLineToRelative(0.0f);
        i.horizontalLineTo(22.0f);
        i.verticalLineToRelative(-2.0f);
        i.horizontalLineTo(16.9f);
        i.close();
        i.moveTo(12.0f, 15.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 13.66f, 15.0f, 12.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _commit = build;
        build.getClass();
        return build;
    }
}
