package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.kf0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m5375clipPathKD09W0M(DrawScope drawScope, Path path, int i, ky kyVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5258clipPathmtrdDE(path, i);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static void m5376clipPathKD09W0M$default(DrawScope drawScope, Path path, int i, ky kyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m4750getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5258clipPathmtrdDE(path, i);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m5377clipRectrOu3jXo(DrawScope drawScope, float f, float f2, float f3, float f4, int i, ky kyVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5259clipRectN_I0leg(f, f2, f3, f4, i);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static void m5378clipRectrOu3jXo$default(DrawScope drawScope, float f, float f2, float f3, float f4, int i, ky kyVar, int i2, Object obj) {
        float f5 = (i2 & 1) != 0 ? 0.0f : f;
        float f6 = (i2 & 2) != 0 ? 0.0f : f2;
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32));
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L));
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            i = ClipOp.Companion.m4750getIntersectrtfAjoo();
        }
        int i3 = i;
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5259clipRectN_I0leg(f5, f6, f7, f8, i3);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    @er
    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final void m5379drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, ky kyVar) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo5256getSizeNHjbRc = drawScope.getDrawContext().mo5256getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo5257setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            kyVar.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
        }
    }

    /* renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m5380drawymL40Pk(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, GraphicsLayer graphicsLayer, ky kyVar) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo5256getSizeNHjbRc = drawScope.getDrawContext().mo5256getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo5257setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            kyVar.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    /* renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static void m5381drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, GraphicsLayer graphicsLayer, ky kyVar, int i, Object obj) {
        if ((i & 16) != 0) {
            graphicsLayer = null;
        }
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo5256getSizeNHjbRc = drawScope.getDrawContext().mo5256getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo5257setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            kyVar.invoke(drawScope);
        } finally {
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    public static final void drawIntoCanvas(DrawScope drawScope, ky kyVar) {
        kyVar.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f, float f2, float f3, float f4, ky kyVar) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f3, f4);
        try {
            kyVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().inset(-f, -f2, -f3, -f4);
        }
    }

    public static void inset$default(DrawScope drawScope, float f, float f2, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        try {
            kyVar.invoke(drawScope);
        } finally {
            float f3 = -f;
            float f4 = -f2;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m5382rotateRg1IO4c(DrawScope drawScope, float f, long j, ky kyVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5262rotateUv8p0NA(f, j);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static void m5383rotateRg1IO4c$default(DrawScope drawScope, float f, long j, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo5334getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5262rotateUv8p0NA(f, j);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m5384rotateRadRg1IO4c(DrawScope drawScope, float f, long j, ky kyVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5262rotateUv8p0NA(DegreesKt.degrees(f), j);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static void m5385rotateRadRg1IO4c$default(DrawScope drawScope, float f, long j, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo5334getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5262rotateUv8p0NA(DegreesKt.degrees(f), j);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m5386scaleFgt4K4Q(DrawScope drawScope, float f, float f2, long j, ky kyVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5263scale0AR0LA0(f, f2, j);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static void m5387scaleFgt4K4Q$default(DrawScope drawScope, float f, float f2, long j, ky kyVar, int i, Object obj) {
        if ((i & 4) != 0) {
            j = drawScope.mo5334getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5263scale0AR0LA0(f, f2, j);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m5388scaleRg1IO4c(DrawScope drawScope, float f, long j, ky kyVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5263scale0AR0LA0(f, f, j);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static void m5389scaleRg1IO4c$default(DrawScope drawScope, float f, long j, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo5334getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5263scale0AR0LA0(f, f, j);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    public static final void translate(DrawScope drawScope, float f, float f2, ky kyVar) {
        drawScope.getDrawContext().getTransform().translate(f, f2);
        try {
            kyVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f2);
        }
    }

    public static void translate$default(DrawScope drawScope, float f, float f2, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f, f2);
        try {
            kyVar.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f2);
        }
    }

    public static final void withTransform(DrawScope drawScope, ky kyVar, ky kyVar2) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            kyVar.invoke(drawContext.getTransform());
            kyVar2.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    public static final void inset(DrawScope drawScope, float f, ky kyVar) {
        drawScope.getDrawContext().getTransform().inset(f, f, f, f);
        try {
            kyVar.invoke(drawScope);
        } finally {
            float f2 = -f;
            drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
        }
    }

    public static final void inset(DrawScope drawScope, float f, float f2, ky kyVar) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        try {
            kyVar.invoke(drawScope);
        } finally {
            float f3 = -f;
            float f4 = -f2;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }
}
