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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UndoKt {
    private static ImageVector _undo;

    public static final ImageVector getUndo(Icons.Sharp sharp) {
        ImageVector imageVector = _undo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Undo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 8.0f);
        b.curveToRelative(-2.65f, 0.0f, -5.05f, 0.99f, -6.9f, 2.6f);
        af0.m(b, 2.0f, 7.0f, 9.0f, 9.0f);
        b.lineToRelative(-3.62f, -3.62f);
        b.curveToRelative(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f);
        b.curveToRelative(3.54f, 0.0f, 6.55f, 2.31f, 7.6f, 5.5f);
        b.lineToRelative(2.37f, -0.78f);
        b.curveTo(21.08f, 11.03f, 17.15f, 8.0f, 12.5f, 8.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _undo = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getUndo$annotations(Icons.Sharp sharp) {
    }
}
